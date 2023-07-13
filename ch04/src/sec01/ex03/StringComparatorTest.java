package sec01.ex03;

public class StringComparatorTest {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		boolean sameName1 = name1.equals(name2);
		System.out.println(sameName1);
		
		boolean sameName2 = name1.equals("홍길동");
		System.out.println(sameName2);
		
		boolean sameName3 = "홍길동".equals("이순신");
		System.out.println(sameName3);
	}
}
