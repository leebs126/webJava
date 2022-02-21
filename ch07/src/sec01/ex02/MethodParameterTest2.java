package sec01.ex02;

public class MethodParameterTest2 {

	public static void main(String[] args) {
		int a1 = 10;
		int a2= 20;
		double d1 = 1.5;
		double d2 = 3.6;
		
		MethodParameterTest2 m = new MethodParameterTest2();
		m.addInt(11, 22);
		m.addInt(a1, 22);
		m.addInt(a1, a2);
//		m.addInt(11, 1.5);
		
		System.out.println();
		m.addDouble(1.5, 3.6);
		m.addDouble(d1, 3.6);
		m.addDouble(d1, d2);
		m.addDouble(10, 20);
		
		System.out.println("\n종료");

	}
	
	public void addInt(int x, int y) {
		int result = x + y;
		System.out.println("두 정수의 합 : " +  result);
	}
	
	public void addDouble(double x, double y) {
		double result = x + y;
		System.out.println("두 실수의 합 : " +  result);
	}

}
