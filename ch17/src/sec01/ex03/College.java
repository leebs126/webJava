package sec01.ex03;

public class College extends Student {
	int courses;

	College() {
		this("홍길동", 2, 23);
	}

	College(String name, int grade, int courses) {
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "이름: " + name + " 학년: " + grade + " 학점: " + courses;
	}

}
