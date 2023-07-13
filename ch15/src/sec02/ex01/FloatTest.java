package sec02.ex01;

public class FloatTest {

	public static void main(String[] args) {
		System.out.println("Float 의 최대값: " + Float.MAX_VALUE);
		System.out.println("Float 의 최소값: " + Float.MIN_VALUE);
		System.out.println();

		String num1 = "3.15F";
		String num2 = num1 + 2.0F;
		System.out.println("num2 = " + num2);
		
		float num3 = Float.parseFloat(num1) + 2.0F;
		System.out.println("num3 = " + num3);
		
		float num4 = 123.345F;
		String num5 = Float.toString(num4) + "hello";
		System.out.println("num5 = " + num5);

	}

}
