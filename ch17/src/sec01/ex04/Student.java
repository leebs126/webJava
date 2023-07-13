package sec01.ex04;

public class Student {
	String name;
	int grade;

	Student() {
		this("이순신", 3);
	}

	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		
		return "이름: " + name +" 학년: " +grade;
	}

}
