package sec03.ex02;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args)  throws Exception {
		File file1 = new File("src\\sec03\\ex02\\fileWriter.txt");
		File file2 = new File("src\\sec03\\ex02\\printWriter.txt");
		
		PrintWriter pw1 = new PrintWriter(System.out);
//		PrintStream out1 = new PrintWriter(System.out, true, "UTF-8");
		
		FileWriter fw = new FileWriter(file1);
		PrintWriter pw2 = new PrintWriter(file2);
//		PrintWriter pw2 = new PrintWriter(file2, true, "UTF-8");

		pw1.println("안녕하세요");
		pw1.println(100);  
		pw1.println(3.15F);
		pw1.println(3.14);
		pw1.println("자바 프로그래밍입니다.");
		pw1.flush();
		
		fw.write("안녕하세요");
		fw.write(100);  
//		fw.write(3.15F);
//		fw.write(3.14);
		fw.write("자바 프로그래밍입니다.");
		fw.flush();


		pw2.println("안녕하세요");
		pw2.println(100);  
		pw2.println(3.15F);
		pw2.println(3.14);
		pw2.println("자바 프로그래밍입니다.");
		pw2.flush();

		fw.close();
		pw1.close();
		pw2.close();

	}

}
