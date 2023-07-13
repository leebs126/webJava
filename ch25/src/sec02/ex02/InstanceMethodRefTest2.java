package sec02.ex02;

@FunctionalInterface
interface MyFuncInterface {
	void methodA(int k);
}

class MyMath {

	public void print(int k) {
		System.out.println(k);
	}
}

public class InstanceMethodRefTest2 {
	public static void main(String[] args) {
		MyMath myMath = new MyMath();
		MyFuncInterface mfi3 = System.out::println;
		mfi3.methodA(10);
	}

}