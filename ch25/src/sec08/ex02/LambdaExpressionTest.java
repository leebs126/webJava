package sec08.ex02;


@FunctionalInterface
interface MyFuncInterface {
	MyMath methodA();
}

class MyMath{
	public MyMath() {
//		System.out.println("MyMath 기본 생성자 호출");
	}
	
	public MyMath(int a, int b) {
//		System.out.println("매개변수 한 개 MyMath 생성자 호출");	
	}
	
	
	
	public int max(int a, int b) {
		return Math.max(a, b);
	}
}

public class LambdaExpressionTest {
	public static void main(String[] args) {
		MyFuncInterface mfi= MyMath::new;
		MyMath myMath= mfi.methodA();
		int result = myMath.max(100, 200);
		System.out.println(result);
	}

}
