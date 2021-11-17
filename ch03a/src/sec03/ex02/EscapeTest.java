package sec03.ex02;

public class EscapeTest {

	public static void main(String[] args) {
		String str1 = "Hello World!";
		String str2 = "Hello \nWorld!";
		String str3 = "Hello \t\tWorld!";
		String str4 = "Hello \rWorld!"; 
		String str5 = "\'Hello World!\'";
		String str6 = "\"Hello World!\"";
		String str7 = "\\Hello World!\\";
		
		String str9 = "Hello \n\rWorld!";
		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println(str5);
//		System.out.println(str6);
//		System.out.println(str7);
//		System.out.println(str9);
				
//		System.out.print("Hello World! ");
//		System.out.println();
//		System.out.print("안녕하세요");
		
		System.out.print("Hello World! \n");
		System.out.print("안녕하세요");


	}

}
