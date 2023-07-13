package sec01.ex01;

public class Student {
	String name;
	int grade;
	
//필드 선언과 동시에 초기화 할 수 있습니다.
//	String name = "홍길동"; 
//	int grade = 2; 
		

	public void study() {
		System.out.println("공부를 합니다.");
	}

	public int test() {
		System.out.println("국어 시험을 칩니다.");
		return 85;
	}

}
