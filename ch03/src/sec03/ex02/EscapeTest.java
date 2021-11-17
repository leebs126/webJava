package sec03.ex02;

public class EscapeTest {

	public static void main(String[] args) {
		String str1 = "Hello World!";
		String str2 = "Hello \nWorld!";
		String str3 = "Hello \tWorld!";
		String str4 = "Hello \rWorld!";
		String str5 = "\'Hello World!\'";
		String str6 = "\"Hello World!\"";
		String str7 = "\\Hello World!\\";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		char ch1 ='\t';
		
		System.out.print("Hello");
		System.out.print(ch1);
		System.out.print(ch1);
		System.out.print("World!");
	}

}
