package sec04.ex02;


@FunctionalInterface
interface MyFuncInterface {
	MyMath methodA();
}

class MyMath{
	public MyMath() {
		System.out.println("MyMath 기본 생성자 호출");
	}
	
	public MyMath(int a) {
		System.out.println("MyMath 매개변수 한 개 생성자 호출");	
	}
	
	public void print(int a, int b) {
		System.out.println(a + b);
	}
}


public class ConstructorRefTest2 {
	public static void main(String[] args) {
		MyFuncInterface mfi3 = MyMath::new;
		MyMath myMath3 = mfi3.methodA();
		myMath3.print(1000, 2000);
	}

}
