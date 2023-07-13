package sec02.ex01;

public class MinusIntegerTest1 {
	public static void main(String[] args) {
		int num1 = 0b1010;
		int num2 = ~0b1010;
		int num3 = num2 + 1;
		int num4 = ~0b1010 + 1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
	}

}
