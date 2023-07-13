package sec01.ex01;

public class Outter {
	private String name;
	private int age;

	public Outter(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
//	public String getAddress() {
//		return address;
//	}
	

	//내부 클래스
	public class Inner {
		private String address;

		public Inner(String address) {
			this.address = address;
		}

		public String getUserInfo() {
			return "이름 : " + name + ", 나이: " + age + ", 주소 : " + address;
		}  
	}

}
