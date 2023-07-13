package sec01.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerTest {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw;
		PrintWriter writer = null;
		InetAddress clientIP = null;
		String message = null;

		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버 실행 중... ");
			
			while (true) {
				socket = serverSocket.accept();
				clientIP = socket.getInetAddress();
				System.out.println("접속 IP: " + clientIP);
				
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				bw = new BufferedWriter(new OutputStreamWriter(os));
				writer = new PrintWriter(bw, true);
				writer.println("서버: 접속을 환영합니다.");

				br = new BufferedReader(new InputStreamReader(is));
				message = br.readLine();
				System.out.println(message);
				
				writer.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
