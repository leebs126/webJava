package sec03.ex01;

public class CharConversionTest {

	public static void main(String[] args) {
		char ch1 = 'h';
		char ch2 = 'e';
		char ch3 = 'l';
		char ch4 = 'l';
		char ch5 = 'o';

		System.out.print(ch1);
		System.out.print(ch2);
		System.out.print(ch3);
		System.out.print(ch4);
		System.out.print(ch5);
		System.out.println();
		
		System.out.print(ch1 - 32);
		System.out.print(ch2 - 32);
		System.out.print(ch3 - 32);
		System.out.print(ch4 - 32);
		System.out.print(ch5 - 32);
		System.out.println();
		
		
		System.out.print((char)(ch1 - 32));
		System.out.print((char)(ch2 - 32));
		System.out.print((char)(ch3 - 32));
		System.out.print((char)(ch4 - 32));
		System.out.print((char)(ch5 - 32));
	}
}
