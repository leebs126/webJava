package sec02.ex03;

public class RandomMethodTest {

	public static void main(String[] args) {
		
		int rand = (int)(Math.random() * 100* 9) %  10 + 1;  //1 ~ 10
		System.out.println("양의 정수 : " + rand);
		

		rand = (int)(Math.random() * 1000 * 200) % (200 - 20) + 20;  //20 - 200
		System.out.println("양의 정수 : " + rand);
		
		
//		int rand = (int)(Math.random() * (10 - 1 + 1)) + 1;  //1 ~ 10
//		System.out.println("양의 정수 : " + rand);
		
		
//		int rand = (int)(Math.random() * 1000) %  9 + 1;
//		System.out.println("양의 정수 : " + rand);
//		
//		rand = (int)(Math.random() * 1000) % 100 + 100;
//		System.out.println("양의 정수 : " + rand);
//				
		
//		System.out.println(Math.random());
		
//		int rand = (int) (Math.random() * 100) + 1;
//		System.out.println("양의 정수 : " + rand);
//		
//		rand = (int)(Math.random() * 200 ) + 20;
//		System.out.println("양의 정수 : " + rand);

	}

}
