package sec02.ex01;

public class SignOpTest {

	public static void main(String[] args) {
		int num1 = -100;
		double num2 = 3.1415;

		System.out.println(+num1); // -100
		System.out.println(+num2); // 3.1415

		System.out.println(-num1); // 100
		System.out.println(-num2); // 3.1415

		System.out.println(num1); //  -100
		System.out.println(num2); //   3.1415

		num1 = -num1;
		num2 = -num2;

		System.out.println(num1); // 100  
		System.out.println(num2); // -3.1415

	}

}
