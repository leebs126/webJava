package sec01.ex01;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("손흥민",3);
		System.out.println(s1.getStudInfo());
		System.out.println();
		
		Object obj1 = new Student("홍길동",2);
		Student s2 = (Student)obj1;
		System.out.println(s2.getStudInfo());
	}

}
