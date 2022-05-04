package sec07.ex01;

public class PrimeUtil {

	public int calcPrime(int num) {
		int total = 0; // 소수의 합이 저장

		int count = 0;
		int val = 1;
		while (val <= num) {
			for (int i = 1; i <= val; i++) {
				if (val % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(val+", " );
				total += val;
			}
			val++;
			count = 0;
		}

		return total;
	}

	public int calcPrime(int num1, int num2) {
		// 기능 구현

		return 0;
	}

}
