package sec02.ex01;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			num[2] = 3; // 예외 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		
		System.out.println("프로그램 종료");

	}

}
