package sec01.ex02;

public class ArrayParameterTest {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		String[] name = { "이순신", "홍길동", "임꺽정" };

		ArrayParameterTest m = new ArrayParameterTest();
		m.printArray(num);
		System.out.println();
		m.printString(name);
		
		System.out.println("\n종료");

	}

	public void printArray(int[] arr) {
		System.out.println("printArray() 메소드 호출");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void printString(String[] arr) {
		System.out.println("printString() 메소드 호출");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
