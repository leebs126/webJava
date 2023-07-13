package sec06.ex02;

public class Student {
	public static int MALE = 1;
	public static int FEMALE = 2;
	
	private String name;
	private int grade;
	private int score;
	private int gender;

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

	public Student(String name, int grade, int score, int gender) {
		this.name = name;
		this.grade = grade;
		this.score = score;
		this.gender = gender;
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		String info = name +", " + grade +", "+ score +", " + gender;
		return info;
	}
	 
	

}
