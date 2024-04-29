package sec03.ex01;

public class Student extends Person {
	protected String name;
	protected int grade;
	protected int score;

	public Student() {
		System.out.println("Student 기본 생성자 호출");
	}

	public Student(String name, int grade) {
		System.out.println("매개변수가 있는 Student 생성자 호출");
		this.name = name;
		this.grade = grade;
	}
	
	public Student(String name, int grade, int score) {
		System.out.println("매개변수가 있는 Student 생성자 호출");
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	

	public void study() {
		System.out.println("시험 공부를 합니다.");
	}

//	public void calcScore(College c) {
//		System.out.println("시험 점수 구하기");
//	}
//
//	public void calcScore(Middle m) {
//		System.out.println("시험 점수 구하기");
//	}

//	public void calcScore(Student s) {
//		System.out.println("학생 시험 점수 구하기");
//	}


	public void calcScore(Student s) {
	
		if (s instanceof College) {
			College c = (College) s;
			char credit = c.getCredit();
			System.out.println("대학생 학점 : " + credit);

		} else if (s instanceof Middle) {
			Middle m = (Middle) s;
			int score = m.score;

			System.out.println("중학생 시험점수 : " + score);
		}
	
	//	if(s instanceof College c) {
	//		char credit = c.getCredit();
	//		System.out.println("대학생 학점 : " + credit);
	//		
	//	}else if(s instanceof Middle m) {
	//		int score = m.score;
	//				
	//		System.out.println("중학생 시험 : " + score);
	//	}
}

	// 학생 신상 정보 출력 메소드
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메소드입니다.");
		return "이름: " + name + " , 학년: " + grade;
	}

}
