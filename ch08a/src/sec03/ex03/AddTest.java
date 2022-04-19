package sec03.ex03;

public class AddTest {

	public static void main(String[] args) {
		AddUtil addUtil = new AddUtil();

		int result1 = addUtil.add(10, 20);
		System.out.println("result1 : " + result1);
		
		float result2 = addUtil.add(1.5F, 4.5F);
		System.out.println("result2 : " + result2);
		
		int result3 = addUtil.add(5, 10, 15);
		System.out.println("result3 : " + result3);
		
		float result4 = addUtil.add(0.5F, 10.2F, 15.5F);
		System.out.println("result4 : " + result4);

	}

}
