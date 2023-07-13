package sec05.ex01;

public class NullPointerTest {

	public static void main(String[] args) {
		String str1 = null;
//		System.out.println(str1.length());

		str1 = "hello";
		System.out.println(str1.length());
		
		String str2 = "";
		System.out.println(str2.length());
		
//		Student s1 = null;
//		String name = s1.name;
//		int grade = s1.grade;
		
		Student s1 = new Student("홍길동", 2);
		String name = s1.name;
		int grade = s1.grade;
		
		System.out.println("이름 : " + name +", 학년 : " + grade);
		

	}

}

class Student {
	String name;
	int grade;

	public Student(String _name, int _grade) {
		name = _name;
		grade = _grade;
	}
}
