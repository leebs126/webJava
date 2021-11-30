package sec01.ex04;

public class LogicalOpTgest {

	public static void main(String[] args) {

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		
		System.out.println(!false);
		System.out.println(false ^ false);
		System.out.println(true ^ false);
		System.out.println();
		
		
		int a = 10, b = 10, c = 20;
		boolean result = (a == b) && (b == c);
//		result = (5 + 6) && (b += 10);
		
		System.out.println(result);
		System.out.println();
		
		result = (a == b) || (b == c);
		System.out.println(result);
		System.out.println(!result);

	}

}
