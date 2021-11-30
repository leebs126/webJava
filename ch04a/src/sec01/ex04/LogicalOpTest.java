package sec01.ex04;

public class LogicalOpTest {

	public static void main(String[] args) {
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
//		
//		System.out.println(!false);
//		System.out.println(false ^ false);
//		System.out.println(true ^ false);
		
		int a = 10, b = 10, c = 20;
		boolean result = (a == b) && (b == c);  // true && false
//		boolean result =(5 + 6) && (b += 10);  //논리 연산자의 양쪽 수식의 최종 결과값은 true이거나 false이어야 한다.
		System.out.println(result);
		
		result = (a == b) || (b == c);  // true || false
		System.out.println(result);
		System.out.println(!result);
		
		
		
		
		
		
		
		

	}

}
