package sec01.ex01;

public class LocalVarTest {

	public static void main(String[] args) {
		// 1. 메소드를 사용하기 위해서 클래스 인스턴스 생성 후 참조변수에 할당
		LocalVarTest m2 = new LocalVarTest();

		// 2. 메소드 사용
		m2.printSumFrom1To100();
//		System.out.println("1에서100까지의 합 : " + sum);		

		System.out.println("종료");

	}

	public void printSumFrom1To100() {
		int sum = 0; // 지역변수 선언 후 초기화를 해주어야 합니다.
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1에서100까지의 합 : " + sum);
	}

}
