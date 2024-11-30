package sec02.ex02;

@FunctionalInterface
interface MyFuncInterface {
	void methodA(int k);
}


public class InstanceMethodRefTest2 {
	public static void main(String[] args) {
		MyFuncInterface mfi3 = System.out::println;
		mfi3.methodA(10);
	}

}