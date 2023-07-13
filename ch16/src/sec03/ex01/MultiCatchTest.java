package sec03.ex01;

public class MultiCatchTest {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
//			num[2] = 3;
			num[1] = 3 / 0;
			
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("실행 예외가 발생했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");
	}

}
