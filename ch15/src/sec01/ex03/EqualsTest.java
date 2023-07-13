package sec01.ex03;

public class EqualsTest {

	public static void main(String[] args) {
		Student s1 = new Student("이순신", 2);
		Student s2 = new Student("이순신",2);
		Student s3 = new Student("홍길동",3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
