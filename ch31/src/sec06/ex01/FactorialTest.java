package sec06.ex01;

public class FactorialTest {
	public static void main(String[] args) {
		System.out.println(factorial(5)); 
		System.out.println(factorial(15)); 
		System.out.println(factorial(0)); 
		//System.out.println(factorial(-1)); // 출력: 에러 메시지
	}

	private static long factorial(int n) {
		long result= 0;
		if (n < 0) {
			throw new IllegalArgumentException("음수는 허용하지 않습니다.");
		}else if (n == 0) {
			result = 1 ;
		}else if (n == 1) {
			result = 1;
		}else {
			 result =n * factorial(n - 1);
		}
		
		return result;
	}
	
}	
