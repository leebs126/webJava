package sec02.ex01;

import java.io.File;

public class FileMethodTest2 {

	public static void main(String[] args) {
		File file1 = new File("C:\\webJava1\\flowers.jpg");
		System.out.println(file1.exists());   //true
		System.out.println(file1.isFile());  //true
		System.out.println(file1.isDirectory());  //false
		System.out.println();
		
		System.out.println(file1.canExecute());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		System.out.println();
		
		System.out.println(file1.getName());
		System.out.println(file1.length());
		System.out.println(file1.getPath());
		System.out.println(file1.getParent());
		System.out.println();
		
		String[] list = new File("C:\\webJava1\\").list();
		for(String file: list) {
			System.out.println(file);
		}
	}

}
