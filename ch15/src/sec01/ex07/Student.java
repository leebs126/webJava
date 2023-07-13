package sec01.ex07;

public class Student {
	String name;
	int grade;

	public Student() {
		this("이순신", 3);
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Student();
	}
	
	
}