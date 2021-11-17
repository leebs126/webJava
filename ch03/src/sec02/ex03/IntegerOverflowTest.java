package sec02.ex03;

public class IntegerOverflowTest {
	public static void main(String[] args) {
		byte b1 = 127;
		short s1 = 32767;
		int num1 = 2147483647;
		int num2 = -2147483648;
		long num3 = 9_223_372_036_854_775_807L;
		long num4 = -9_223_372_036_854_775_808L;

		System.out.println("b1 = " + b1);
		System.out.println("s1 = " + s1);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println();

		//b1=b1+1;      
		//s1=s1+1;    
		num1 = num1 + 1;
		num2 = num2 - 1;
		num3 = num3 + 1;
		num4 = num4 - 1;

//		System.out.println("b1 + 1 = " + b1);
//		System.out.println("s1 = " + s1);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
	}
}
