package sec05.ex01;

public class NullPointerTest {

	public static void main(String[] args) {
		String str1 = null; //참조 변수에 어떤 인스턴스도 지정되지 않았습니다.
//		System.out.println(str1.length());  //NullPointerException 예외 발생
		
		str1 = "hello";
		System.out.println(str1.length());  //5
		
		String str2 = "";
		System.out.println(str2.length());  //0
		
//		Student s1 = null;
//		String name = s1.name;  //NullPointerException 예외 발생
//		int grade = s1.grade;
		
		Student s2 = new Student("홍길동", 2);
		String name = s2.name;
		int grade = s2.grade;
		
		System.out.println("이름: " + name +", 학년: " + grade);
		
		
		
	}

}

class Student{
	String name;
	int grade;
	
	public Student(String _name, int _grade) {
		name = _name;
		grade = _grade;
	}
}

