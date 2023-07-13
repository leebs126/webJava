package sec04.ex04;

@FunctionalInterface
interface MyFuncInterface {
	int[] methodA(int len);
}

public class ArrayRefTest {
	public static void main(String[] args) {
		MyFuncInterface mfi1 = new MyFuncInterface() {
			@Override
			public int[] methodA(int len) {
				return new int[len];
			}
		};

		int[] arr1 = mfi1.methodA(5);
		System.out.println("arr1.length: " + arr1.length);

		MyFuncInterface mfi2 = (len) -> new int[len];
		int[] arr2 = mfi2.methodA(10);
		System.out.println("arr2.length: " + arr2.length);

		MyFuncInterface mfi3 = int[]::new;
		int[] arr3 = mfi3.methodA(15);
		System.out.println("arr3.length: " + arr3.length);
	}
}
