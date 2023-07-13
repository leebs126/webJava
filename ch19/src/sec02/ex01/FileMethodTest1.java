package sec02.ex01;

import java.io.File;
import java.io.IOException;

public class FileMethodTest1 {
	public static void main(String[] args) {
		File javaDir1 = new File("C:\\webJava1");
		
		
		System.out.println((javaDir1.exists()));
		javaDir1.mkdir();
		System.out.println((javaDir1.exists()));
		System.out.println();
		
		File javaDir2 =new File("C:\\webJava2\\dir"); 
		System.out.println((javaDir2.exists()));
		javaDir2.mkdir();
		System.out.println((javaDir2.exists()));
		System.out.println();
		
		File javaDir3 = new File("C:\\webJava2\\dir");
		System.out.println((javaDir3.exists()));
		javaDir3.mkdirs();
		System.out.println((javaDir3.exists()));
		System.out.println();
		
//		File javaDir4 = new File("C:\\webJava3\\dir\\test1.txt");
//		System.out.println((javaDir4.exists()));
//		javaDir4.mkdir();
//		javaDir4.mkdirs();
//		System.out.println((javaDir4.exists()));

		try {
			File file1 = new File("C:\\webJava1\\test1.txt");
			System.out.println((file1.exists()));
			file1.createNewFile();
			System.out.println((file1.exists()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
