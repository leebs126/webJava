package sec03.ex01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args)  throws Exception {
		File file1 = new File("src\\sec03\\ex01\\fileOutputStream.txt");
		File file2 = new File("src\\sec03\\ex01\\printStream.txt");
		
		PrintStream ps1 = new PrintStream(System.out);
//		PrintStream ps1 = new PrintStream(System.out, true, "UTF-8");
		
		FileOutputStream fos = new FileOutputStream(file1);
		OutputStreamWriter writer = new OutputStreamWriter(fos);
		
		PrintStream ps2 = new PrintStream(file2);
//		PrintStream ps2 = new PrintStream(file1, true, "UTF-8");
		

		ps1.println("안녕하세요");
		ps1.println(100);  
		ps1.println(3.15F);
		ps1.println(3.14);
		ps1.println("자바 프로그래밍입니다.");
		ps1.flush();

		
		writer.write("안녕하세요");
		writer.write("\n");
		writer.write(100);  
//		writer.write(3.15F);
//		writer.write(3.14);
		writer.write("자바 프로그래밍입니다.");
		writer.flush();
		writer.close();
		
		ps2.println("안녕하세요");
		ps2.println(100);  
		ps2.println(3.15F);
		ps2.println(3.14);
		ps2.println("자바 프로그래밍입니다.");
		ps2.flush();

		ps1.close();
		ps2.close();

	}

}
