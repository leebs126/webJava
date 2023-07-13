package sec02.ex02;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientTest {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		BufferedWriter bw = null;
		PrintWriter writer = null;
		String outMessage = null;
		
		try {
			socket = new Socket("121.168.202.151", 8888);  
			os = socket.getOutputStream();
			
			RecvThread rThread=new RecvThread(socket);
			rThread.start( );
			
			Scanner sc = new Scanner(System.in);
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			writer = new PrintWriter(bw, true);
			
			while (true) {
				outMessage = sc.nextLine();
				if (outMessage.equals("exit"))
					break;
				System.out.println("클라이언트: " + outMessage);
				writer.println("클라이언트: " + outMessage);
			}
			
			sc.close();
			writer.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
