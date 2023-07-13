package sec01.ex01;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayDataWriteTest1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\test\\test2.txt");
			
			byte[] bArray = {'h' , 'e' , 'l', 'l', 'o'}; 
			
			fos.write(bArray);
			fos.flush();
			fos.close();
			
			System.out.println("파일에 출력했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
