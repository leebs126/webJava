package sec04.ex01;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer city1 = new StringBuffer("서울시");
		System.out.println("city1:" + city1);
		
		city1.append(" 강남구");
		System.out.println("city1:" + city1);
		
		city1.append(" 역삼동");
		System.out.println("city1:" + city1);
	}

}
