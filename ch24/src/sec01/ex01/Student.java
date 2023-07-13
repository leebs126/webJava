package sec01.ex01;

public class Student extends Person {
	protected int grade;
	
	public Student() {}
	
	public Student(String name, int grade) {
		super.name= name;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		String info = "이름: " + name +", 학년: " + grade;
		return info;
	}
	
	
}
