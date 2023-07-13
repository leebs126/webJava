package sec02.ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		String msg;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("종료: ctrl + z");
		try {
			while (true) {
				msg = br.readLine();
				if(msg == null) break;
				System.out.println("출력:" + msg);
				
			}
			
			isr.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
