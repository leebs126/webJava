package sec04.ex01;

public class FloatDoubleVarTest {

	public static void main(String[] args) {
		float num1 = 1.23456f;
		double num2 = 1.23456d;
		double num3 = 1.23456;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println();
		
//		num1 = 0.28;
		num2 = 0.28f;  //자동으로 float형 실수가 double형 실수로 변환된다. 0.28d
		
		//변수에 지수형 실수 대입하기
		num1 = .28f;
		num2 = 2e+10;
		num3 = 9.26E+3;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
	}

}
