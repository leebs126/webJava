package sec08.ex02;

public class ClassReturnTest {

	public static Student calcScore(String name, int kor, int eng) {
		Student student = new Student();
		student.name = name;
		student.kor = kor;
		student.eng = eng;
		student.total = kor + eng;
		return student;
	}

	
	public static void main(String[] args) {
		Student lee, hong;
		
		lee = calcScore("이순신", 80, 90);
		System.out.println(lee.toString());
		System.out.println();

		hong = calcScore("홍길동", 70, 83);
		System.out.println(hong.toString());
	}
}
