package sec02.ex05;

@FunctionalInterface
 interface MyFuncInterface {
	void methodA();
}

class MyMath{
	public static void print() {
		System.out.println("print() 정적 메서드 호출");
	}
}

public class StaticMethodRefTest2{
	 public static void main(String[] args) {
		 MyFuncInterface mfi = MyMath::print;
		 mfi.methodA();		 
	 }

}