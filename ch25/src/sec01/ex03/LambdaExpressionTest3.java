package sec01.ex03;

@FunctionalInterface
interface MyFuncInterface {
	public int methodC(int a, int b);
}

public class LambdaExpressionTest3 {
	public static void main(String[] args) {
		MyFuncInterface mfi1 = (int a, int b) -> {
			return a + b;
		};

		int result1 = mfi1.methodC(10, 20);
		System.out.println(result1);

		MyFuncInterface mfi2 = (a, b) -> {
			return (a + b);
		};
		int result2 = mfi2.methodC(100, 200);
		System.out.println(result2);

		MyFuncInterface mfi3 = (a, b) -> a + b;
		int result3 = mfi3.methodC(1000, 2000);
		System.out.println(result3);

	}

}
