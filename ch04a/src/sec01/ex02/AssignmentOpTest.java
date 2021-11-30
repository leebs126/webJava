package sec01.ex02;

public class AssignmentOpTest {

	public static void main(String[] args) {
		int sum = 6;
		int var1 = 4;
		
		sum += 4;   //sum = sum + 4 = 6 + 4 = 10
		System.out.println("sum = " + sum);
		
		sum = 6;
		sum -= 4;  //sum = sum - 4 = 6 - 4 = 2
		System.out.println("sum = " + sum);
		
		sum = 6;
		sum += var1 ;  //sum = sum + var1 = 6 + 4 = 10
		System.out.println("sum = " + sum);
		
		sum = 6;
		sum -= var1 ;  //sum = sum - var1 = 6 - 4 = 2
		System.out.println("sum = " + sum);

		sum = 6;
		sum *= var1 ;  //sum = sum * var1 = 6 * 4 = 24
		System.out.println("sum = " + sum);
		
		sum = 6;
		sum /= var1 ;  //sum = sum / var1 = 6 / 4 = 1
		System.out.println("sum = " + sum);

		sum = 6;
		sum %= var1 ;  //sum = sum % var1 = 6 % 4 = 2
		System.out.println("sum = " + sum);


	}

}
