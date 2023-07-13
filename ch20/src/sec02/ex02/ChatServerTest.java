package sec02.ex02;

import java.io.BufferedWriter;
import java.io.IOException;
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
		OutputStream os = null;
		BufferedWriter bw = null;
		PrintWriter writer = null;
		String outMessage = null;
		
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버 실행 중...");
			socket = serverSocket.accept();

			os = socket.getOutputStream();
			
			RecvThread rThread=new RecvThread(socket);
			rThread.start( );
			
			Scanner sc = new Scanner(System.in);
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			
			writer = new PrintWriter(bw, true);
			writer.println("서버: 접속을 환영합니다.");
			
			while (true) {
				outMessage = sc.nextLine();
				if (outMessage.equals("exit"))
					break;
				
				System.out.println("서버: " + outMessage);
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
