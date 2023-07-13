package sec01.ex01;


@FunctionalInterface
interface MyFuncInterface{
	public void methodA();
//	public void methodB();
}


public class LambdaExpressionTest1 {
	public static void main(String[] args) {
		MyFuncInterface mfi1 = ()->{
				System.out.println("methodA() 호출");
		};
		
		mfi1.methodA();
		
		MyFuncInterface mfi2 = ()->System.out.println("methodA() 호출");
		mfi2.methodA();

	}

}
