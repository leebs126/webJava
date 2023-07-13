package sec01.ex04;

public class Student<T, M> implements Person<T, M> {
	private T name;
	private M age;

	@Override
	public void setName(T name) {
		this.name = name;
		
	}

	@Override
	public void setAge(M age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String info = "이름: " + name +", 나이: " + age;
		return info;
	}

}
