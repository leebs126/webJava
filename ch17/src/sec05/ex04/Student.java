package sec05.ex04;

public class Student implements Comparable {
	String name;
	int grade;
	int score; // 시험점수

	public Student() {}

	public Student(String name, int grade, int score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	@Override
	public int compareTo(Object o) {
		if (score > ((Student) o).score) {
			return 1;
		} else if (score == ((Student) o).score) {
			return 0;
		} else {
			return -1;
		}
	}
}
