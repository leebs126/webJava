package sec03.ex04;

public class NullAndEmptyStringTest {
	public static void main(String[] args) {
		String str1 = null;
		String str2 ="";
		
//		int length1 = str1.length();  //NullPointerException
//		System.out.println(length1);
		int length2 = str2.length();  //0
//		System.out.println(length2);
		
		System.out.println(str1+"Hello"); //null이 문자열로 변환됩니다.
		System.out.println(str2+"Hello");

	}

}
