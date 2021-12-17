package sec02.ex02;

public class WhilePrintFrom1To10Test {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 5) {
			System.out.println("i = " + i);
			i++;
		}

		System.out.println("while문 밖에서 i의 값 : " + i);

	}

}
