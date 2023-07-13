package sec03.ex01;


@FunctionalInterface
interface MyFuncInterface {
	void methodA(MyMath myMath, int a, int b);
}

class MyMath{
	public  void print(int a, int b) {
		System.out.println(a + b);
	}
}

public class ParameterRefTest1 {
	public static void main(String[] args) {
		
		MyFuncInterface mfi1 = new MyFuncInterface() {
			@Override
			public void methodA(MyMath myMath, int a, int b) {
				myMath.print(a, b);
			}
		};
		mfi1.methodA(new MyMath(), 10, 20);
		
		MyFuncInterface mfi2 = (myMath, a, b) -> {
			myMath.print(a, b);
		};
		mfi2.methodA(new MyMath(), 100, 200);
		
	}

}
