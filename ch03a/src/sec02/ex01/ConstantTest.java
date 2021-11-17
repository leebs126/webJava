package sec02.ex01;

public class ConstantTest {

	public static void main(String[] args) {
		final int SAFE_SPEED = 60;  //규정 속도
		final int MAX_VALUE = 214748367;
		final int MIN_VALUE = -2147483648;
		final String SERVER_IP_ADDRESS = "13.124.56.189";
		
		System.out.println("규정 속도는 " + SAFE_SPEED + "km입니다.");
		
		
//		SAFE_SPEED = 80;  //상수는 값을 변경 할 수 없다.
		System.out.println("정수의 최댓값: " +MAX_VALUE);
		System.out.println("정수의 최소값: " +MIN_VALUE);
		
		System.out.println("서버 IP 주소는 " + SERVER_IP_ADDRESS +"입니다.");
		
		System.out.println("원주율은 " +Math.PI + "입니다.");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		
		
		
		
		
		
		

	}

}
