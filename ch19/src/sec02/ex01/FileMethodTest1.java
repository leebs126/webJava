package sec02.ex01;

import java.io.File;
import java.io.IOException;

public class FileMethodTest1 {
	public static void main(String[] args) {
		File javaDir1 = new File("C:\\webJava1");
		
		System.out.println(javaDir1.exists());  //false
		javaDir1.mkdir();
		System.out.println(javaDir1.exists());   //true
		System.out.println();
		
		File javaDir2 =new File("C:\\webJava2\\dir"); 
		System.out.println(javaDir2.exists());  //false
 		javaDir2.mkdir();
		System.out.println(javaDir2.exists());   //false
		System.out.println();
		
		File javaDir3 = new File("C:\\webJava2\\dir");
		System.out.println(javaDir3.exists());   //false
		javaDir3.mkdirs();
		System.out.println(javaDir3.exists());   //true
		System.out.println();
		
		//mkdir()과 mkdirs()는 경로만 생성가능합니다.(파일 생성 불가)
//		File javaDir4 = new File("C:\\webJava3\\dir\\test1.txt");
//		System.out.println(javaDir4.exists());   
//		javaDir4.mkdir();
//		javaDir4.mkdirs();
//		System.out.println(javaDir4.exists());   

		try {
			File file1 = new File("C:\\webJava1\\test1.txt");
			System.out.println((file1.exists()));   //false
			file1.createNewFile();  //경로와 파일을 동시에 생성합니다.
			System.out.println((file1.exists()));   //true
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
