package sec04.ex03;


@FunctionalInterface
interface MyFuncInterface {
//	MyMath methodA();
	MyMath methodB(int x);
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


public class ConstructorRefTest3 {
	public static void main(String[] args) {
//		MyFuncInterface mfi3 = MyMath::new;
//		MyMath myMath3 = mfi3.methodA();
//		myMath3.print(1000, 2000);
		
		MyFuncInterface mfi4 = MyMath::new;
		MyMath myMath4 = mfi4.methodB(10);
		myMath4.print(10000, 20000);
	}

}
