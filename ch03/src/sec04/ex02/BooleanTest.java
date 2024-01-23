package sec04.ex02;

public class BooleanTest {

	public static void main(String[] args) {
		boolean b1 = true;
//		boolean b1 = "true";
		System.out.println("b1 = " + b1);

		// b1 = "false";
//		b1 = 5;
		b1 = false;
		System.out.println("b1 = " + b1);
		
		if(b1) {
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}
		
		boolean b2 = false;
		b2 = Boolean.parseBoolean("true");
		System.out.println("b2 = " + b2);

	}

}
