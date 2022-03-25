package sec01.ex02;

public class Student {
	// 속성을 필드로 구현한다.
	String name;
	int grade;

	// 기능을 메소드로 구현합니다.

	public void study() {
		System.out.println("공부를 합니다.");
	}

	public int test() {
		System.out.println("국어 시험을 칩니다.");
		return 85;
	}

}