package sec03.ex02;

@FunctionalInterface
interface MyFuncInterface {
	void methodA(MyMath myMath, int a, int b);
}

class MyMath{
	public  void print(int a, int b) {
		System.out.println(a + b);
	}
}

public class ParameterRefTest2 {
	public static void main(String[] args) {
		MyFuncInterface mfi3 = MyMath::print;
		mfi3.methodA(new MyMath(), 1000, 2000);
	}
}
