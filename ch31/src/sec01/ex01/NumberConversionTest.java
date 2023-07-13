package sec01.ex01;

public class NumberConversionTest {
	public static void main(String[] args) {
		int decimal = 88;
		String binary = Integer.toBinaryString(decimal);     // 10진수 -> 2진수
		String octal = Integer.toOctalString(decimal);       // 10진수 -> 8진수
		String hexaDecimal = Integer.toHexString(decimal);   // 10진수 -> 16진수
		System.out.println("10진수: " + decimal);
		System.out.println("2진수: " + binary);
		System.out.println("8진수: " + octal);
		System.out.println("16진수: " + hexaDecimal);

	}

}
