package sec04.ex01;


@FunctionalInterface
interface MyFuncInterface {
	MyMath methodA();
}

class MyMath{
	public MyMath() {
		System.out.println("MyMath 기본 생성자 호출");
	}
	
	public MyMath(int a) {
		System.out.println("매개변수 한 개 MyMath 생성자 호출");	
	}
	
	public void print(int a, int b) {
		System.out.println(a + b);
	}
}


public class ConstructorRefTest1 {
	public static void main(String[] args) {
		MyFuncInterface mfi1 = new MyFuncInterface() {
			@Override
			public MyMath methodA() {
				return new MyMath();
			}
		};
		MyMath myMath1 = mfi1.methodA();
		myMath1.print(10, 20);
		
		MyFuncInterface mfi2 = () -> {
			return new MyMath();
		};
		MyMath myMath2= mfi2.methodA();
		myMath2.print(100, 200);
		

	}

}
