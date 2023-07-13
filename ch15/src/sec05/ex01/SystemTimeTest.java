package sec05.ex01;

public class SystemTimeTest {

	public static void sum(long num) {
		long beginTime = System.currentTimeMillis();
		long sum = 0;
		
		for (int i = 0; i <= num; i++) {
			sum += i;
		}

		long endTime = System.currentTimeMillis();

		System.out.println("1에서" + num + "까지의 합 : " + sum);
		System.out.println("계산 소요 시간 : " + (endTime - beginTime) + "ms");

	}

	public static void main(String[] args) {
		sum(1000000);
		System.out.println();
		sum(10000000);
	}

}
