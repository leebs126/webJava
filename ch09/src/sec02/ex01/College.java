package sec02.ex01;

public class College extends Student {
	private int courses; //학점
	
	public College(String _name, int _grade, int _courses) {
		System.out.println("College 클래스의 생성자 호출");
		name = _name;
		grade = _grade;
		courses = _courses;
	}
	
	public int getCourses() {
		return courses;
	}
	
}
