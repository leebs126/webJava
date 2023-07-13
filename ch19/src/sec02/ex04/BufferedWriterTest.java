package sec02.ex04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterTest {

	public static void main(String[] args) {
		String msg;
		Scanner sc= new Scanner(System.in);
		System.out.println("종료하려면 q를 입력하세요.");
		
		try {
			FileWriter fw = new FileWriter("src\\sec02\\ex04\\output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			while (true) {
				msg = sc.nextLine();
				if(msg.equals("q")) break;
				bw.write(msg);
				bw.newLine(); //출력 문자열 마지막에 개행문자(\n\r)을 추가해 줍니다.
				bw.flush();
			}
			fw.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
