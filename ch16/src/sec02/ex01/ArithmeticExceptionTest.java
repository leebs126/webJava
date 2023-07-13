package sec02.ex01;

public class ArithmeticExceptionTest {

	public static void main(String[] args) {
		try {
			int num = 3;
			int result = num / 0;
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램 종료");

	}

}
