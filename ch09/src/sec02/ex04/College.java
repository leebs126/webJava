package sec02.ex04;

public class College extends Student {
	private int courses; 
	
	public College() {
		this("이순신", 2, 20);
		System.out.println("College 클래스의 기본 생성자 호출");
//		this("이순신", 2, 20); //반드시 첫 줄 작성해야 합니다.
		
	}
	public College(String name, int grade, int courses) {
		super();
		System.out.println("매개변수가 3개인 College 생성자 호출");
		
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
	public int getCourses() {
		return courses;
	}
	
}
