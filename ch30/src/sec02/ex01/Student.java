package sec02.ex01;


public class Student  {
	String name;  
	int grade;
	int score;


	public Student() {}

	public Student(String name, int grade, int score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	

	// 학생 신상 정보 출력 메소드
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메소드입니다.");
		return "이름: " + name + " , 학년: " + grade;
	}


}
