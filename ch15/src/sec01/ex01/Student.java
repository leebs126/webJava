package sec01.ex01;

public class Student extends Object {
	private String name;  
	private int grade;


	public Student() {
		System.out.println("Student 기본 생성자 호출");
	}

	public Student(String name, int grade) {
		System.out.println("매개변수가 있는 Student 생성자 호출");
		this.name = name;
		this.grade = grade;
	}

	// 학생 신상 정보 출력 메소드
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메소드입니다.");
		return "이름: " + name + " , 학년: " + grade;
	}

}