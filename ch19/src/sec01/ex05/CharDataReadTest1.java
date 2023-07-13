package sec01.ex05;

import java.io.FileReader;
import java.io.IOException;

public class CharDataReadTest1 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\test\\test3.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
