package sec02.ex03;

public class BinOctHexTest {

	public static void main(String[] args) {
		int num1 = 200;
		int bin = 0b11010011;  //이진수
		int oct = 0110;   //팔진수
		int hex = 0x13FC;  //16진수
		
		System.out.println("num1 = " +num1);
		System.out.println("bin = " + bin);
		System.out.println("oct = " + oct);
		System.out.println("hex = " + hex);
		
		System.out.println("num1 = " + Integer.toBinaryString(num1));
		System.out.println("bin = " + Integer.toOctalString(bin));
		System.out.println("oct = " + Integer.toHexString(oct));
		

	}

}
