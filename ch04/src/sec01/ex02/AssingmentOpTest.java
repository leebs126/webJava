package sec01.ex02;

public class AssingmentOpTest {

	public static void main(String[] args) {
		int sum = 6;
		int var1 = 4;
		
		sum += 4;  //sum = sum + 4;
		System.out.println("sum : " + sum);
		
		sum = 6;
		sum *= 4;  //sum =sum * 4;
		System.out.println("sum : " + sum);
		
		sum = 6;
		sum += var1; //sum = sum + var1;
		System.out.println("sum : " + sum);
		
		sum = 6;
		sum -= var1; //sum = sum - var1;
		System.out.println("sum : " + sum);
		
		
		sum = 6;
		sum *= var1; //sum = sum * var1;
		System.out.println("sum : " + sum);
		
		sum = 6;
		sum /= var1; //sum = sum / var1;
		System.out.println("sum : " + sum);
		
		sum = 6;
		sum %= var1; //sum = sum % var1;
		System.out.println("sum : " + sum);
		

	}

}
