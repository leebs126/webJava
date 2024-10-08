package sec02.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServerTest {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter writer = null;
		OutputStream os = null;
		String inMessage = null;
		String outMessage = null;
		
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버 실행 중...");
			socket = serverSocket.accept();  //accept() 메서드 호출 시 클라이언트 접속을 대기합니다.(스레드 대기 상태)

			is = socket.getInputStream();
			os = socket.getOutputStream();
			Scanner sc = new Scanner(System.in);
			
			br = new BufferedReader(new InputStreamReader(is));
			bw = new BufferedWriter(new OutputStreamWriter(os));
			
			writer = new PrintWriter(bw, true);
			writer.println("서버: 접속을 환영합니다. 메시지를 먼저 보내세요.");
			
			while (true) {
				inMessage = br.readLine();
				System.out.println(inMessage);
				outMessage = sc.nextLine();
				
				if (outMessage.equals("exit"))
					break;
				
				writer.println("서버: " + outMessage);
			}
			
			sc.close();
			writer.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
