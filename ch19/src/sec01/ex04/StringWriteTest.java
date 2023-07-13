package sec01.ex04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriteTest {

	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("C:\\test\\test6.txt");
			String str = "안녕하세요!";
			writer.write(str);
//			writer.write(str, 1, str.length()-1);  //"녕하세요"
			writer.flush();
			writer.close();
			System.out.println("문자열을 파일로 출력했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
