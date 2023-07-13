package sec04.ex01;

public class MemberVO {
	private String id;
	private String name;
	private int height;
	private int weight;
	private int age;
	
	public MemberVO() {}
	
	public MemberVO(String id, String name, int height, int weight, int age) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
