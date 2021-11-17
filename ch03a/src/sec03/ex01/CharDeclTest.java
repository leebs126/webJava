package sec03.ex01;

public class CharDeclTest {

	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = '가';
		
//		char ch3 = 'ab';
//		char ch4 = "a";
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 +"의 유니코드 = " + (int)ch1);
		System.out.println(ch2 +"의 유니코드 = " + (int)ch2);
		

	}

}
