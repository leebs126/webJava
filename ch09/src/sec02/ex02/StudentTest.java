package sec02.ex02;

public class StudentTest {
	public static void main(String[] args) {
		String sinsang = null;
		String gender = null;
		int age = 0;
		Middle m = new Middle("이순신", 2, "남", 15);
		sinsang = m.getStudInfo();
		gender = m.getGender();
		age = m.getAge();
		
		System.out.println("\n학생정보");
		System.out.println("-------------------------------------------");
		System.out.println(sinsang + " 성별: " + gender + ", 나이: " + age);

	}

}
