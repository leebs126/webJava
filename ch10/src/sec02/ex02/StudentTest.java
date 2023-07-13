package sec02.ex02;

public class StudentTest {

	public static void main(String[] args) {
		Middle m = new Middle("이순신", 3, 80);
		College c  = new College("홍길동", 2, 24, 'B');
		
		System.out.println();
		c.calcScore(c);
		m.calcScore(m);
	}
}
