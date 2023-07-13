package sec01.ex04;

public class College extends Student {
	private int courses;

	public College() {
		this("이순신", 2, 20, "홍길동");
		System.out.println("College 클래스의 기본 생성자 호출");
//		this("이순신", 2, 20); //반드시 첫 줄 작성해야 합니다.

	}

	public College(String name, int grade, int courses, String teacher) {
		super();
		System.out.println("College 생성자 호출");

		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
		this.courses = courses;
	}

	public int getCourses() {
		return courses;
	}

	public String getStudInfo() {
		System.out.println("College 클래스의 getStudInfo() 메서드 호출");
		return "이름은>> " + name + ", 학년은>> " + grade + ", 신청 학점은>> " + courses;
	}

	@Override
	public String getTeacher() {
		return "지도 교수님 : " + teacher;
	}

	

}
