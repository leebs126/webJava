package sec02.ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerTest {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		ChatServerThread thread;

		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버 실행 중...");

			while (true) {
				socket = serverSocket.accept();

				InputStream is = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String nickName = br.readLine();

				// 연결 확인용
				System.out.println("접속 IP: " + socket.getInetAddress());
				System.out.println("접속자:" + nickName);

				thread = new ChatServerThread(socket, nickName);
				thread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
