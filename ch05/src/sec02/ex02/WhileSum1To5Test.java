package sec02.ex02;

public class WhileSum1To5Test {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 5) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
			i++;
		}

		System.out.println("1에서 5까지의 합 : " + sum);

//		for (int i = 1; i <= 5; i++) {
//			sum += i;
//			System.out.println("i = " + i + ", sum = " + sum);
//		}
//
//		System.out.println("1에서 5까지의 합 : " + sum);
	}
}
