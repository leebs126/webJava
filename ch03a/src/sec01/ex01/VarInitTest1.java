package sec01.ex01;

public class VarInitTest1 {

	public static void main(String[] args) {
//		int num;  //변수 선언
//		num = 12;  //변수 초기화
		int num = 12;  //변수 선언과 동시에 초기화한다
//		num = 12.5;  //변수에는 선언와 타입과 같은 데이터만 저장할 수 있다.
		
		System.out.println(num);
		System.out.println("num = " + num);
		num =  30;
		System.out.println("num = " + num);

	}

}
