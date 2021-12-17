package sec02.ex02;

public class WhilePrintFrom1Tio5Test {

	public static void main(String[] args) {
		int i = 5;  //반복 변수 선언
		
		while(i >= 0) {
			System.out.println("i = " + i);
			i--;   //i를 1 증가시킴
		}
		
		System.out.println("while문 밖에서의 i 값 : " + i);
		
		
		

	}

}
