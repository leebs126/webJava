package sec03.ex02;

public class FinallyTest {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
//			num[2] = 3;
			num[1] = 3 / 0;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally 블럭은 항상 실행됩니다");
		}

		System.out.println("프로그램 종료");
	}

}
