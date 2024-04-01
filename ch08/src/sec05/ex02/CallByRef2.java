package sec05.ex02;

public class CallByRef2 {
	public static void main(String[] args) {
		CallByRef2 st = new CallByRef2();
		Student s1 = new Student("이순신", 3);
		
		System.out.println("메서드 호출 전");
		System.out.println("--------------");
		System.out.println("이름: " + s1.name);
		System.out.println("학년: " + s1.grade);
		
		System.out.println("\n메서드 호출 후");
		System.out.println("--------------");
		st.setStudInfo(s1);
		System.out.println("이름: " + s1.name);
		System.out.println("학년: " + s1.grade);
	}

	public void setStudInfo(Student s) {
		s.name = "홍길동";
		s.grade = 2;
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