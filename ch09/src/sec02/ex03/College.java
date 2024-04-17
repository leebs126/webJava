package sec02.ex03;

public class College extends Student {
	private int courses; 
	
	public College() {
		System.out.println("College 클래스의 기본 생성자 호출");
		
	}
	public College(String name, int grade, int _courses) {
		super();
		//super(name, grade); //매개변수 있는 Student 생성자를 명시적으로 호출합니다.
		System.out.println("매개변수가 3개인 College 생성자 호출");
		
		super.name = name;
		super.grade = grade;
		courses = _courses;
	}
	
	public int getCourses() {
		return courses;
	}
	
}
