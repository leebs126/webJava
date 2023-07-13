package sec03.ex01;

public class StringImmutableTest {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		String name = "홍";
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
		
		a = b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
		
		System.out.println("name = " + name);
		name = "홍"+"길동";
		System.out.println("name = " + name);
		
		String fullName = name.concat(" 안녕");
		System.out.println("fullName = " + fullName);
	}

}
