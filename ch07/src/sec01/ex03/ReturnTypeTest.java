package sec01.ex03;

public class ReturnTypeTest {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 20;
		double d1 = 1.5;
		double d2 = 3.6;
		
		ReturnTypeTest m = new ReturnTypeTest();
		int result1 = m.addInt(10, 20);
		System.out.println("result1 : " + result1);
		
		result1 = m.addInt(a1, a2);
		System.out.println("result1 : " + result1);
		
		System.out.println("result1 : " + m.addInt(a1, 30));
		System.out.println();
		
		double result2 = m.multiply(1.5, 3.5);
		System.out.println("result2: " + result2);
		
		result2 = m.multiply(d1, 3.6);
		System.out.println("result2: " + result2);
		
		result2 = m.multiply(d1, d2);
		System.out.println("result2: " + result2);
		
		System.out.println("종료");
		
	}
	
	public int addInt(int x, int y) {
		int result = x + y;
		return result;
//		return;
//		return 3.56;
	}
	
	public double multiply(double x, double y) {
		double result = x * y;
		return result;
//		return 56;  //double 타입으로 자동 변환되어서 반환됩니다.
	}

}
