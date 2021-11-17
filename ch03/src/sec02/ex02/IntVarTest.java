package sec02.ex02;

public class IntVarTest {

	public static void main(String[] args) {
		byte b1 = 100;
		short s1 = 30000;
		int num1 = -1234567890;
		int num2 = 1_234_567_890;
		long num3 = 9223372036854775807L;
		long num4 = -9_223_372_036_854_775_808L;

		System.out.println("b1=" + b1);
		System.out.println("s1=" + s1);
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		System.out.println("num3=" + num3);
		System.out.println("num4=" + num4);
	}
}
