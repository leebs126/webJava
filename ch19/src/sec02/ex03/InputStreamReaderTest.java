package sec02.ex03;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			int data;
			
			while(true) {
				data = isr.read();
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
