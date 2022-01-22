package sec02.ex03;

public class RandomMethodTest {

	public static void main(String[] args) {
//		System.out.println(Math.random());

//		int rand = (int) (Math.random() * 100) + 1;
//		System.out.println("양의 정수 : " + rand);
		
		//20에서 200 사이의 정수 
		int rand = (int) (Math.random() * 1000 * 200) % (200 - 20 + 1) + 20;
		System.out.println("양의 정수 : " + rand);
		
		//0 ~181
	}

}
