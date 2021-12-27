package sec04.ex02;

public class ContinueTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0) 
				continue;

			System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
	}

}
