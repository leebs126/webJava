package sec01.ex06;

public class Student {
	String name;
	int grade;

	public Student() {
	}

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		String info = "이름: " + name + ", 학년: " + grade;
		return info;
	}
	
	
}