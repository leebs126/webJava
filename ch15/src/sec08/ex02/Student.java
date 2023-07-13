package sec08.ex02;

public class Student {
	String name;
	int kor;
	int eng;
	int total;

	public Student() {}
	
	@Override
	public String toString() {
		String info = name + "의 시험점수" +"\n"
	                 + "국어: " + kor 
	                 + ", 영어: " + eng 
	                 + ", 총점: " + total;
		return info;
	}
}
