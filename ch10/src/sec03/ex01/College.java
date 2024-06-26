package sec03.ex01;

public class College extends Student {
	private int courses;
	private char credit;   //학점

	public College() {
		this("이순신", 2, 20 );
		System.out.println("College 클래스의 기본 생성자 호출");

	}

	public College(String name, int grade, int courses) {
		super();
		System.out.println("매개변수가 3개인 College 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
	public College(String name, int grade, int courses, char credit) {
		super();
		System.out.println("매개변수가 4개인 College 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
		this.credit = credit;
	}
	
	public College(String name, int grade, int courses, String gender, int age ) {
		super();
		System.out.println("매개변수가 5개인 College 생성자 호출");
		super.gender = gender;
		super.age = age;
		super.name = name;
		super.grade = grade;
		this.courses = courses;
		
	}
	

	public int getCourses() {
		return courses;
	}
	
	public char getCredit() {
		return credit;
	}

	@Override
	public String getStudInfo() {
		System.out.println("College 클래스의 getStudInfo() 메소드입니다.");
		return "이름 >> "+ name + ", 학년 >> " +grade + ", 학점 >> " + courses;
		
	}

}
