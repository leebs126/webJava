package sec02.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientTest {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter writer = null;
		String inMessage = null;
		String outMessage = null;
		
		try {
			socket = new Socket("121.168.202.151", 8888);  
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			Scanner sc = new Scanner(System.in);
			
			br = new BufferedReader(new InputStreamReader(is));
			bw = new BufferedWriter(new OutputStreamWriter(os));
			writer = new PrintWriter(bw, true);
			while (true) {
				inMessage = br.readLine();
				System.out.println(inMessage);
				outMessage = sc.nextLine();
				
				if (outMessage.equals("exit"))
					break;
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
