package sec01.ex01;

public class ArithmeticOpTest {

	public static void main(String[] args) {
		int result = 0;
		int var1 = 5, var2 = 4;
		
		result = 100 + 200;  
		System.out.println("result : " + result);
		
		result = var1 + 200;
		System.out.println("result : " + result);
		
		result = var1 + var2;
		System.out.println("result : " + result);
		
		result = result + var1;
		System.out.println("result : " + result);
		
		result = var1 - var2;
		System.out.println("result : " + result);
		
		result = var1 * var2;
		System.out.println("result : " + result);
		
		result = var1 / var2;
		System.out.println("result : " + result);
		
		result = var1 % var2;
		System.out.println("result : " + result);
	}

}
