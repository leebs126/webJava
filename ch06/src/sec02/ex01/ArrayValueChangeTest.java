package sec02.ex01;

public class ArrayValueChangeTest {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int len = num.length;
		int[] temp = new int[len];

		System.out.println("교환 전 배열 요소 값");
		for (int i = 0; i < len; i++) {
			System.out.print(num[i] + "\t");
		}

		// 배열 요소 값 교환하기
		for (int i = 0; i < len; i++) {
			temp[i] = num[len - 1 - i];
		}

		// 배열 요소값 복사하기
		for (int i = 0; i < len; i++) {
			num[i] = temp[i];
		}

		System.out.println("\n\n교환 후 배열 요소 값");
		for (int i = 0; i < len; i++) {
			System.out.print(num[i] + "\t");
		}

	}

}
