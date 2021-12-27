package sec04.ex01;

public class NestedForBreakTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3)
					break;  //break문은 자신을 포함하는 가장 가까운 반복문을 종료합니다.
				
				System.out.println("i= " + i + ", j= " + j);
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");

	}

}
