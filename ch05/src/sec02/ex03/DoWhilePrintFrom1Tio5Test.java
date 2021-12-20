package sec02.ex03;

public class DoWhilePrintFrom1Tio5Test {

	public static void main(String[] args) {
		int i = 1;  //반복 변수 선언
		
		do{
			System.out.println("i = " + i);
			i++;   //i를 1 증가시킴
		}while(i <= 5) ;
		
		System.out.println("do-while문 밖에서의 i 값 : " + i);

		
//		while(i >= 0) {
//			System.out.println("i = " + i);
//			i--;   //i를 1 증가시킴
//		}
//		
//		System.out.println("while문 밖에서의 i 값 : " + i);
		
		
		

	}

}
