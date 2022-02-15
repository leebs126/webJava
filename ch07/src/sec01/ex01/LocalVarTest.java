package sec01.ex01;

public class LocalVarTest {

	public static void main(String[] args) {
		// 1. 클래스 인스턴스 생성 후 참조 변수 대입
		LocalVarTest m2 = new LocalVarTest();
		m2.printSumFrom1To100();
		
//		System.out.println("1에서 100까지의 합 : " + sum);
		System.out.println("종료");

	}

	public void printSumFrom1To100() {
		int sum = 0;  //메소드 상단에 메소드 내에서 사용할 지역변수를 선언합니다.
		
		for(int i=1; i<= 100;i++) {
			sum+= i;
		}
		
		System.out.println("1에서 100까지의 합 : " + sum);

	}

}
