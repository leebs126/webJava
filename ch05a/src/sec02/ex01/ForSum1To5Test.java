package sec02.ex01;

public class ForSum1To5Test {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
		}

		System.out.println("1에서 100까지의 합 : " + sum);

	}

}
