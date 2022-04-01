package sec02.ex04;

public class Student {
	String name;
	int grade;
	
	//생략하면 컴파일 시 컴파일러가 자동으로 추가해 줍니다.
	public Student() {
		System.out.println("기본 생성자 호출");
		int num = 10;
		System.out.println("num = " + num);
	}
	
	public Student(String _name) {
		System.out.println("매개변수가 한 개인 생성자 호출");
		name = _name;
	}
	
	public Student(String _name, int _grade) {
		System.out.println("매개변수가 두 개인 생성자 호출");
		name = _name;
		grade = _grade;
	}
	
	//학생 신상 정보 출력 메소드
	public void getStudInfo() {
		System.out.println("이름 : " + name +" , 학년 : " +   grade);
	}
	
	
}
