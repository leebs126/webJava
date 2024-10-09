package sec02.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServerThread extends Thread {
	private Socket socket;
	private static List<ChatServerThread> threads = new ArrayList<ChatServerThread>();
	InputStream is;
	OutputStream os;
	BufferedWriter bw;
	BufferedReader br;
	PrintWriter writer;
	String message;
	String nickName;

	public ChatServerThread(Socket socket, String nickName) {
		this.nickName = nickName;
		this.socket = socket;
		threads.add(this); // 사용자 수신 스레드 객체를 ArrayList에 저장합니다.
	}

	public void run() {
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();

			bw = new BufferedWriter(new OutputStreamWriter(os));
			writer = new PrintWriter(bw, true);
			writer.println("서버에 접속되었습니다.");

			while (true) {
				try {
					br = new BufferedReader(new InputStreamReader(is));
					message = br.readLine();
					if (message == null)  //클라이언트 Socket 객체 소멸 시 null을 전송함
						throw new IOException();

					sendMessageAll(message);// 모든 수신 스레드에 대해서 메시지를 송신합니다.

				} catch (IOException e) {
					System.out.println(nickName + "이 접속을 해제했습니다.");
					threads.remove(this);
					return;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessageAll(String message) throws IOException {
		ChatServerThread thread = null;

		for (int i = 0; i < threads.size(); i++) { // ArrayList에 저장된 스레드를 가지고 와서 각각의 스레드에서 메시지를 전송합니다.
			thread = threads.get(i);
			if (thread.isAlive())
				thread.sendMessage(message);
		}

		// 서버 콘솔로 출력
		System.out.println(message);

	}

	public void sendMessage(String message) throws IOException {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		writer.println(message);
	}
}
