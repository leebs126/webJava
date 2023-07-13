package sec01.ex02;

public class College extends Student {
	private int credit;
	
	public College(String name, int grade, int credit) {
		super.name = name;
		super.grade = grade;
		this.credit = credit;
	}
}
