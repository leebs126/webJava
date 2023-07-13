package sec01.ex05;


public class Student {
	String hakbun;
	String name;
	int grade;

	Student() {
		this("20220001", "이순신", 3);
	}

	Student(String hakbun, String name, int grade) {
		this.hakbun = hakbun;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "학번: " + hakbun + " 이름: " + name +" 학년: " +grade;
	}
	
}
