package sec02.ex01;

public class StudentTest {

	public static void main(String[] args) {
		Middle m = new Middle("이순신", 3);
		College c  = new College("홍길동", 2, 24);
		
		System.out.println();
		c.calcScore(c);
		m.calcScore(m);
	}
}
