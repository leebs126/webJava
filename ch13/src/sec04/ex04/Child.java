package sec04.ex04;

public class Child implements ITest3 {

	@Override
	public void method1() {
		System.out.println("method1() 호출");
	}
	
	@Override
	public void method2() {
		System.out.println("method2() 호출");
	}

	@Override
	public void method3() {
		System.out.println("상속 받는 ITest3의 method3() 호출");
		
	}


}
