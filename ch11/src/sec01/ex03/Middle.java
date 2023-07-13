package sec01.ex03;

public class Middle extends Student {

	public Middle(String name, int grade, String teacher) {
		super();
		System.out.println("Middle 클래스 생성자 호출");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
	}

	public String getClassTeacher() {
		return "박길순 선생님";
	}

}
