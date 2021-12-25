package sec03.ex01;

public class NestedForTest {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}

	}

}
