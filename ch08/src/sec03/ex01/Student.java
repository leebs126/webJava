package sec03.ex01;

public class Student {
	// 속성을 필드로 구현한다.
	String name;
	int grade;
//	String addr;
	
	//기본 생성자
	public Student() {}  //명시적으로 생성자 구현 시 기본 생성자는 추가되지 않습니다.
	
	//매개변수가 한 개인 생성자
	public Student(String _name) {
		name = _name;
	}
	
	/*
	public Student(String _n) {
		name = _n;
	}
	*/
	
	
	
	public Student(int _grade) {
		grade = _grade;
	}
	
	/*
	public Student(int _g) {
		grade = _g;
	}
	*/
	
	
	//매개변수가 두 개인 생성자
	public Student(String _name, int _grade) {
		name = _name;
		grade = _grade;
	}
	
	/*
	public Student(int _grade, String _name) {
		name = _name;
		grade = _grade;
	}
	*/
	
	
	
	//학생 신상 정보 출력 메소드
	public void getStudInfo() {
		System.out.println("이름 : " + name +", 학년 : " + grade);
		
	}

}