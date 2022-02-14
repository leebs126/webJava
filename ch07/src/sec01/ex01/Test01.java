package sec01.ex01;

public class Test01 {

	public static void main(String[] args) {
//		System.out.println("1에서 100까지 합 : " + sum);

	}

	void sum() {
		int a = 0, sum = 0;
		while (true) {
			sum += a;
			if (a > 100) {
				System.out.println("1에서 100까지 합 : " + sum);
				return;
			} else {
				a++;
			}
		}
	}

}
