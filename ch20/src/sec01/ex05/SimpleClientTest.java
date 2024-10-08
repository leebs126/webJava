package sec01.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SimpleClientTest {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter writer = null;
		Socket socket = null;
		String message = null;
		try {
//			socket = new Socket("220.72.44.237", 8888);
			socket = new Socket("127.0.0.1", 8888);
//			socket = new Socket("121.168.202.151", 8888, InetAddress.getLocalHost(), 9999);
			is = socket.getInputStream();
			os  = socket.getOutputStream();
			br = new BufferedReader(new InputStreamReader(is));
			message = br.readLine();
			System.out.println(message);
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			writer = new PrintWriter(bw, true);
			writer.println("클라이언트: 안녕하세요");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
