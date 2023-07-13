package sec02.ex01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ThreadPoolChatClientTest {

	static Socket socket;
	static String nickName ;

	static void startClient(String nickName) {
		// 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// 소켓 생성 및 연결 요청
					socket = new Socket("localhost", 8888);
					send(nickName);
				} catch (Exception e) {
					System.out.println("[서버 통신 안됨]");
					if (!socket.isClosed()) {
						stopClient();
					}
					return;
				}
				// 서버에서 보낸 메시지 수신
				receive();
			}
		};
		// 스레드 시작
		thread.start();
	}

	static void stopClient() {
		try {
			System.out.println("[연결 끊음]");
			// 연결 끊기
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (IOException e) {
		}
	}

	static void receive() {
		while (true) {
			try {
				byte[] byteArr = new byte[100];
				InputStream inputStream = socket.getInputStream();

				// 메시지 수신
				int readByteCount = inputStream.read(byteArr);

				// 서버가 정상적으로 Socket의 close()를 호출했을 경우
				if (readByteCount == -1) {
					throw new IOException();
				}

				// 문자열로 변환
				String message = new String(byteArr, 0, readByteCount, "UTF-8");

				System.out.println(message);
			} catch (Exception e) {
				System.out.println("[서버 통신 안됨]");
				stopClient();
				break;
			}
		}
	}

	static void send(String data) {
		// 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// 서버로 메시지 송신
					byte[] byteArr = data.getBytes("UTF-8");
					OutputStream outputStream = socket.getOutputStream();
					// 메시지 송신
					outputStream.write(byteArr);
					outputStream.flush();
				} catch (Exception e) {
					System.out.println("[서버 통신 안됨]");
					stopClient();
				}
			}
		};
		thread.start();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("대화명을 입력하세요.");
		nickName = sc.nextLine();
		startClient(nickName);
		
		while (true) {
			String message = sc.nextLine();
			//exit 입력하면 해당 클라이언트 종료
			if (message.equals("exit"))
				break;
			send(nickName + ": "+ message);
		}
		stopClient();
	}

}
