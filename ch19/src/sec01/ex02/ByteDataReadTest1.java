package sec01.ex02;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteDataReadTest1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\test\\test1.txt");
			while(true) {
				int data = fis.read();
				if(data == -1) break;
				System.out.println(((char)data) + " \t남은 바이트 수:" + fis.available());
			}
			
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
