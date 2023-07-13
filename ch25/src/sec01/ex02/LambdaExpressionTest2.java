package sec01.ex02;

@FunctionalInterface
interface MyFuncInterface{
	public void methodB(int a);
}


public class LambdaExpressionTest2 {
	public static void main(String[] args) {
		MyFuncInterface mfi1 = (int a)->{
				System.out.println(a);
		};
		
		mfi1.methodB(10);
		
		MyFuncInterface mfi2 = (a)->System.out.println(a);
		mfi2.methodB(20);

		
		MyFuncInterface mfi3 = a->System.out.println(a);
		mfi3.methodB(30);

	}

}
