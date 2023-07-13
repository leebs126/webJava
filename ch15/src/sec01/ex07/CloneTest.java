package sec01.ex07;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		Student s2 = (Student)s1.clone();
		
		System.out.println(s1.toString());		
		System.out.println(s2.toString());
		System.out.println();
		
		s1.grade = 2;
		System.out.println(s1.toString());		
		System.out.println(s2.toString());
		

	}

}
