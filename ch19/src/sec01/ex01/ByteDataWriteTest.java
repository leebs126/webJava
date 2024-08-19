package sec01.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteDataWriteTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\test\\test1.txt");
//			FileOutputStream fos = new FileOutputStream("C:\\test\\test1.txt", true);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력해 주세요.");
			String str = sc.nextLine();
			
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				fos.write(ch);
			}
			
			fos.flush();
			fos.close();
			sc.close();
			
			System.out.println("파일에 출력했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
