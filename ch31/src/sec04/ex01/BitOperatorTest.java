package sec04.ex01;

public class BitOperatorTest {
	public static void main(String[] args) {
		System.out.println("88 & 25 = " + (88 & 25));
		System.out.println("01011000 & 00011001 = " + (0b01011000 & 0b00011001));
		System.out.println();

		System.out.println("88 | 25 = " + (88 | 25));
		System.out.println("01011000 | 00011001 = " + (0b01011000 | 0b00011001));
		System.out.println();
		
		System.out.println("88 ^ 25 = " + (88 ^ 25));
		System.out.println("01011000 ^ 00011001 = " + (0b01011000 ^ 0b00011001));
		System.out.println();
		
		System.out.println("~88 = " + (~88));
		System.out.println("~01011000 = " + ~0b01011000);

	}

}
