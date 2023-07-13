package sec04.ex01;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder city1 = new StringBuilder("대구시");
		System.out.println("city1:" + city1);
		
		city1.append(" 달서구");
		System.out.println("city1:" + city1);
		
		city1.append(" 송현동");
		System.out.println("city1:" + city1);

	}

}
