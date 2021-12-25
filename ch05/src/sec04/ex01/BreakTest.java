package sec04.ex01;

public class BreakTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
	}

}
