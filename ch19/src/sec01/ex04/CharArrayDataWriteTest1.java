package sec01.ex04;

import java.io.FileWriter;
import java.io.IOException;

public class CharArrayDataWriteTest1 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\test\\test4.txt");
			
			char[] cArray = {'자' , '바' ,' ', '프', '로', '그', '래', '밍', '입', '니', '다', '.'};
			
			writer.write(cArray);
			writer.flush();
			writer.close();
			
			System.out.println("파일에 출력했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
