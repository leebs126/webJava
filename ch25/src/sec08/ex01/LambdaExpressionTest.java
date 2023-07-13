package sec08.ex01;

@FunctionalInterface
interface MyInterface{
	void add(int a, int b);
}

public class LambdaExpressionTest {
	public static void main(String[] args) {
		MyInterface myInterface1 = new MyInterface() {
			@Override
			public void add(int a, int b) {
				System.out.println(a + b);
			}
		};
		myInterface1.add(10, 20);
		
		
		MyInterface myInterface2 =(a, b)->System.out.println(a + b);
		myInterface2.add(10, 20);
	}

}
