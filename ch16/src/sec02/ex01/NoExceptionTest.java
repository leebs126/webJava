package sec02.ex01;

public class NoExceptionTest {

	public static void main(String[] args) {
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3; // 예외 발생
		System.out.println("프로그램 종료");

	}

}
