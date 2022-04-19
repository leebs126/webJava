package sec03.ex01;

public class Student {
	// 속성을 필드로 구현한다.
	String name;
	int grade;
//	String addr;
	
	//기본 생성자
	public Student() {
		System.out.println("기본 생성자 호출");
		int num = 10;
		System.out.println("num = " + num);
		
	}
	
	//매개변수가 한 개인 생성자
	public Student(String _name) {
		System.out.println("매개변수가 한개인 생성자 호출");
		name = _name;
	}

	/*
	public Student(String _n) {
		System.out.println("매개변수가 한개인 생성자 호출");
		name = _n;
	}
	*/
	
	
	public Student(int _grade) {
		System.out.println("매개변수가 한개인 생성자 호출");
		grade = _grade;
	}
	
	/*
	public Student(int _g) {
		System.out.println("매개변수가 한개인 생성자 호출");
		grade = _g;
	}
	*/
	
	
	//매개변수가 두 개인 생성자
	public Student(String _name, int _grade) {
		System.out.println("매개변수가 두개인 생성자 호출");
		name = _name;
		grade = _grade;
	}
	
	/*
	public Student(int _grade, String _name) {
		System.out.println("매개변수가 두개인 생성자 호출");
		name = _name;
		grade = _grade;
	}
	*/
	
	
	//학생 신상 정보 출력 메소드
	public void getStudInfo() {
		System.out.println("이름 : " + name +", 학년 : " + grade);
		
	}

}