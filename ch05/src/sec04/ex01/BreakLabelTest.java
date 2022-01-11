package sec04.ex01;

public class BreakLabelTest {

	public static void main(String[] args) {

		Outter: 
			for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3)
					break Outter;
				System.out.println("i= " + i + ", j= " + j);
			}	// for문의 끝

			System.out.println();
		}	// for문의 끝

		System.out.println("프로그램 종료");
	}

}
