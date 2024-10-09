package sec02.ex03;

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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("대화명을 입력하세요.");
		String nickName = sc.nextLine();
		
		try {
			socket = new Socket("localhost", 8888);  
			os = socket.getOutputStream();
			
			RecvThread rThread=new RecvThread(socket);
			rThread.start();
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			writer = new PrintWriter(bw, true);
			writer.println(nickName);
			
			while (true) {
				outMessage = sc.nextLine();
				if (outMessage.equals("exit"))
					break;
				writer.println(nickName + ": " + outMessage);
			}
			
			sc.close();
			writer.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
