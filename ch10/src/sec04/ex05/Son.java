package sec04.ex05;

public class Son extends Father{
	private String dept;  //전공 학과명
	
	public Son(String name, String dept) {
		super.name = name;
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

}
