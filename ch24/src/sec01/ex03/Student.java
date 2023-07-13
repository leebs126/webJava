package sec01.ex03;

public class Student<A, B, C> extends Person {
	
	private B grade;
	private C height;

	public B getGrade() {
		return grade;
	}

	public void setGrade(B grade) {
		this.grade = grade;
	}
	
	
	

	public C getHeight() {
		return height;
	}

	public void setHeight(C height) {
		this.height = height;
	}

	@Override
	public String toString() {
		String info = "이름: " + name
				       +", 나이: " + age
				       +", 학년: " + grade
				       +", 키:" + height;
				     
		return info;
	}

}
