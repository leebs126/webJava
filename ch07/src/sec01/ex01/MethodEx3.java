package sec01.ex01;

public class MethodEx3 {

	public static void main(String[] args) {
		// 1. 클래스 인스턴스 생성 후 참조 변수 대입
		MethodEx3 m2 = new MethodEx3();
		m2.printSumFrom1To100();
		
		System.out.println("종료");

	}

	public void printSumFrom1To100() {
		int sum = 0, i = 0;  //메소드 상단에 메소드 내에서 사용할 지역변수를 선언합니다.

		while (true) {
			sum += i;
			if (i >= 100) {
				System.out.println("i = " + i + ", sum = " + sum);
				return; // 메소드 수행을 강제로 종료 시킵니다.
			} else {
				i++;
			}
		}
	}

}
