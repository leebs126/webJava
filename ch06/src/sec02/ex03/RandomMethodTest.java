package sec02.ex03;

public class RandomMethodTest {

	public static void main(String[] args) {
//		System.out.println(Math.random());
		
		int rand = (int)(Math.random() * 100) + 1;  //1-100사이의 정수
		System.out.println("난수: " + rand);

		int rand2 = (int)(Math.random() * (200 - 100 +1)) + 100;  //20 - 200 사이 정수
		System.out.println("난수: " + rand2);
	}
}
