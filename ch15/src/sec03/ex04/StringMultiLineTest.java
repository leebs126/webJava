package sec03.ex04;

public class StringMultiLineTest {
	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = "\"자바\" 프로그래밍입니다.";
		
		String str3 = str1 +"\n"+"\t" +str2;
		System.out.println(str3);
		System.out.println();
		
		String str4 ="""
				안녕하세요.
					"자바" 
				프로그래밍입니다. 
				""";
		System.out.println(str4);
	}

}
