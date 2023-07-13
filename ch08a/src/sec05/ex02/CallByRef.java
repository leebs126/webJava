package sec05.ex02;

public class CallByRef {

	public static void main(String[] args) {
		int[] arr = { 100, 200, 300 };
		CallByRef ref = new CallByRef();
		
		System.out.println("메서드 호출 전");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		ref.increase(arr);
		System.out.println();
		System.out.println("메서드 호출 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}

	public void increase(int[] val) {
		for (int i = 0; i < val.length; i++) {
			val[i]++;
		}
	}

}
