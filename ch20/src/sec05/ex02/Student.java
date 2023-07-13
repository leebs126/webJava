package sec05.ex02;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = -6735641817026272971L;

	String name;
	int kor;
	int eng;
	int math;
	double total;
	double average;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name, double total, double average) {
		this.name = name;
		this.total = total;
		this.average = average;
	}
	

}
