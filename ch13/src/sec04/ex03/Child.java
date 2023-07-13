package sec04.ex03;

public class Child implements ITest1, ITest2 {

	@Override
	public void method1() {
		System.out.println("method1() 호출");
	}
	
	@Override
	public void method2() {
		System.out.println("method2() 호출");
	}

	@Override
	public void test() {
		System.out.println("test() 호출");
		
	}


}
