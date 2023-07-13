package sec02.ex03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecvThread extends Thread {
	InputStream is = null;
	BufferedReader br = null;
	Socket socket = null;
	String inMessage = null;

	public RecvThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			is = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			
			while (true) {
				inMessage = br.readLine();
				System.out.println(inMessage);
			}
		} catch (Exception e) {
			System.out.println("접속을 해제합니다.");
//			e.printStackTrace();
		}
	}
}
