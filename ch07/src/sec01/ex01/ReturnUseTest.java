package sec01.ex01;

public class ReturnUseTest {

	public static void main(String[] args) {
		// 1. 클래스 인스턴스 생성 후 참조 변수 대입
		ReturnUseTest m2 = new ReturnUseTest();
		m2.printSumTo1000();

		System.out.println("종료");

	}

	public void printSumTo1000() {
		int sum = 0, i = 1; // 메소드 상단에 메소드 내에서 사용할 지역변수를 선언합니다.

		while (true) {
			sum += i;
			if (sum >= 1000) {
				System.out.println("i = " + i + ", sum = " + sum);
				return; // 메소드 수행을 강제로 종료 시킵니다.
			} else {
				i+=2;
			}
		}
	}

}
