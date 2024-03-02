package sec02.ex03;

public class RandomMethodTest {

	public static void main(String[] args) {
//		System.out.println(Math.random());  //0에서 1사이의 실수를 리턴합니다.
		
		int rand = (int)(Math.random() * 100* 9) %  10 + 1;  //1 ~ 10
		System.out.println("양의 정수 : " + rand);
		

		rand = (int)(Math.random() * 1000 * 200) % (200 - 20) + 20;  //20 - 200
		System.out.println("양의 정수 : " + rand);
		
		

	}

}
