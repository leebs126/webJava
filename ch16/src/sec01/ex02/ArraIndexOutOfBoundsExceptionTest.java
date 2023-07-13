package sec01.ex02;

public class ArraIndexOutOfBoundsExceptionTest {
	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;  //ArrayIndexOutOfBoundsException 발생
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);  //ArrayIndexOutOfBoundsException 발생
		

	}

}
