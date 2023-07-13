package sec01.ex03;

public class Student {
	protected String name;
	protected int grade;
	protected String teacher;

	public Student() {
		System.out.println("Student 기본 생성자 호출");
	}

	public Student(String name, int grade) {
		System.out.println("매개변수가 있는 Student 생성자 호출");
		this.name = name;
		this.grade = grade;
	}

	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메서드 호출");
		return "이름 : " + name + " ,학년 : " + grade;
	}

	public String getTeacher() {  //학생이 담당 선생님 이름 구하는 메소드
		return "김길동 선생님";
	}

}
