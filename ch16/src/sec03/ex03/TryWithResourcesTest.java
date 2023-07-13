package sec03.ex03;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesTest {
	public static void main(String[] args) {

		//try/catch문으로 예외 처리
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream("test.txt");
			int ch = fis1.read();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		//try-with-resources 사용
		try(FileInputStream fis2 = new FileInputStream("test.txt")){
			int ch = fis2.read();
		}catch(IOException e) {
			System.out.println("IOException이 발생했습니다.");
		}
	}

}
