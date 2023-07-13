package sec01.ex04;

public class PersonTest {
	public static void main(String[] args) {
		Student<String, Integer> hong = new Student<>();
		hong.setName("홍길동");
		hong.setAge(23);
		System.out.println(hong.toString());

	}

}
