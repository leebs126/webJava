package sec01.ex02;

public class EqualsTest {

	public static void main(String[] args) {
		
		String name1 = "이순신";
		String name2 = "이순신";
		String name3 = "홍길동";
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals("이순신"));
		System.out.println(name1.equals(name3));

	}

}
