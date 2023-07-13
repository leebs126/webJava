package sec01.ex02;

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
	
	
}
