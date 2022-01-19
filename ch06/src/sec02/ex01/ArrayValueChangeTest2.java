package sec02.ex01;

public class ArrayValueChangeTest2 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int len = num.length;
		int temp = 0;
		
		System.out.println("교환 전 배열 요소 값");
		for (int i = 0; i < len; i++) {
			System.out.print(num[i] + " ");
		}

		for (int i = 0; i < len/2; i++) {
			temp = num[i];
			num[i] = num[len - 1 - i];
			num[len - 1 - i] = temp;
		}
		
		System.out.println("\n\n교환 후 배열 요소 값");
		
		for(int i = 0; i <len; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
