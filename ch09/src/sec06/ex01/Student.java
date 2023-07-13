package sec06.ex01;

public class Student {
	public String name;
	private int grade;

	public Student() {
		System.out.println("Student 기본 생성자 호출");
	}

	public Student(String name, int grade) {
		System.out.println("매개변수가 2개인 Student 생성자 호출");
		this.name = name;
		this.grade = grade;
	}

}
