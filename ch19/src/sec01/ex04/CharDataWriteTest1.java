package sec01.ex04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharDataWriteTest1 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\test\\test3.txt");
//			FileWriter writer = new FileWriter("C:\\test\\test3.txt", true);

			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력해 주세요.");
			String str = sc.nextLine();

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				writer.write(ch);
			}

			writer.flush();
			writer.close();

			System.out.println("파일에 출력했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
