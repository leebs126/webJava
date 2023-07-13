package sec04.ex04;

public class Student implements Comparable<Student> {
	private String name;
	private int grade;
	private int score;

	public Student() {
	}

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public Student(String name, int grade, int score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}

}
