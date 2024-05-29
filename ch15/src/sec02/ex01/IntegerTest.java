package sec02.ex01;

public class IntegerTest {

	public static void main(String[] args) {
		System.out.println("int의 최대값: " + Integer.MAX_VALUE);
		System.out.println("int의 최소값: " + Integer.MIN_VALUE);
		String num1 = "98";
		String num2 = num1 + 2;
		System.out.println("num2 = " + num2);
		
		int num3 = Integer.parseInt(num1) + 2;
//		int num3 = Integer.parseInt("hello") + 2;  //NumberFormatExcepton 예외 발생
		System.out.println("num3 = " + num3);

		System.out.println("2진수로 변환하기");
		System.out.println(num3 + " --> " + Integer.toBinaryString(num3));
		int num4 = 123;
		
		String num5 = Integer.toString(num4) + "hello";
		System.out.println("num5 = " + num5);

	}

}
