package sec01.ex03;

public class StringComparatorTest {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		boolean isSameName = name1.equals(name2);
		System.out.println(isSameName);
		
		isSameName = name1.equals("홍길동");
		System.out.println(isSameName);
		
		isSameName = "홍길동".equals("이순신");
		System.out.println(isSameName);
	}
}
