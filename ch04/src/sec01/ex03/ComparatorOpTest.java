package sec01.ex03;

public class ComparatorOpTest {

	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		boolean result = false;
		
		result = (x < 20);
		System.out.println("x < 20 : " + result);
		
		result = (x > y);
		System.out.println("x > y : " + result);
		
		result = (x < y);
		System.out.println("x < y : " + result);
	

		result = (x == 10);
		System.out.println("x == 10 : " + result);
		
		result = (x == 10.0);  //피연산자들을 자동으로 형변환 시킨 후 비교한다.
		System.out.println("x == 10.0 : " + result);
		
		result = (x == y);
		System.out.println("x == y : " + result);
		
		result = (x != y);
		System.out.println("x != y : " + result);
		
		result = (x >= 20);
		System.out.println("x >= 20 : " + result);

		result = (x <= y);
		System.out.println("x <= y : " + result);

		
		char ch1 = 'A';
		result = (ch1 == 'A');
		System.out.println("ch1 == 'A' : " + result);
		
		result = (ch1 != 'A');
		System.out.println("ch1 != 'A' : " + result);
		
		result = (ch1 == 'B');
		System.out.println("ch1 == 'B' : " + result);
		
		double num1 = 3.14;
		result = (num1 == 3.14);
		System.out.println("num1 == 3.14 : " + result);
		
		result = (num1 <= 3.15);
		System.out.println("num1 <= 3.15 : " + result);
		
		
		
		
		
		

	}

}
