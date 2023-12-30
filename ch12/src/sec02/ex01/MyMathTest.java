package sec02.ex01;

public class MyMathTest {

	public static void main(String[] args) {
		int result1 = MyMath.add(10, 20);
		System.out.println("두 수의 합 : " + result1);
		System.out.println();
		
		
		result1 = MyMath.substract(10, 20);
		System.out.println("두 수의 차 : " + result1);
		System.out.println();
		
		int radius = 10;
		double result2 = MyMath.pi * radius * radius;
		System.out.println("원이 넓이 : " + result2);
		System.out.println();
		
		result2 = Math.PI * radius * radius;
		System.out.printf("원이 넓이 :%.3f\n",  result2);
		
		
		System.out.println();
		double random = Math.random();
		System.out.println("난수 : " + random);
		
		System.out.println();
		int result3 = (int) Math.sqrt(4);
		System.out.println("4의 제곱근 : " + result3);
		

	}

}
