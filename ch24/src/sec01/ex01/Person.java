package sec01.ex01;

public class Person {
	protected String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "이름: " + name;
	}

}
