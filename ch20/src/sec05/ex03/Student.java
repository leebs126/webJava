package sec05.ex03;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1572293355246985916L;
	String name;
	String subject;
	int score;
	double total;
	double average; 
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	public Student(String name, double total, double average) {
		this.name = name;
		this.total = total;
		this.average = average;
	}
	
	
	
	
		

}
