package sec03.ex01;

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

	 static class Inner {
			private String address;
			static String tel;
			
	
			public Inner(String address) {
				this.address = address;
			}
			
			public static String getTel() {
				return tel;
			}
	
			public String getUserInfo() {
				return  "주소: " + address + "\n"  
					   + "전화번호: " + tel;
			}
	}

}
