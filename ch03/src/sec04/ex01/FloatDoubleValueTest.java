package sec04.ex01;

public class FloatDoubleValueTest {

	public static void main(String[] args) {
		System.out.println("Float 최소값:" + Float.MIN_VALUE);
		System.out.println("Float 최대값:" + Float.MAX_VALUE);
		System.out.println("double 최소값:" + Double.MIN_VALUE);
		System.out.println("double 최대값:" + Double.MAX_VALUE);

		System.out.println(1.23456f);
		System.out.println(1.23456d);
		System.out.println(1.23456); // 1.23456d와 같다.
		System.out.println();
		
		System.out.println(123.0);
		System.out.println(123.);

		System.out.println(.28);
		System.out.println(2e+10);
		System.out.println(9.26E3);
		System.out.println(0.67e-7);
		
		System.out.println(3.14159265358979323846264338327f);
		System.out.println(3.14159265358979323846264338327d);

	}

}
