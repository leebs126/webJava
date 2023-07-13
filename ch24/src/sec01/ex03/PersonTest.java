package sec01.ex03;

public class PersonTest {

	public static void main(String[] args) {
		Student<String, Integer, Double> hong = new Student<>();
		hong.setName("홍길동");
		hong.setAge(25);
		hong.setGrade(2);
		hong.setHeight(178.3);
		
		System.out.println(hong.toString());
		

	}

}
