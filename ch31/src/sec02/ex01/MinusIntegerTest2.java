package sec02.ex01;

public class MinusIntegerTest2 {
	public static void main(String[] args) {
		int num1 = 0b1010;
		int num2 = ~0b1010 + 1;

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num1 + num2: " + (num1 + num2));
	}

}
