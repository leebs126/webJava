package com.oracle.bookshop;

public class Student {
	String name;
	int grade;
	
	public Student() {}  
	
	public Student(String _name) {
		name = _name;
	}
	
	
	public Student(int _grade) {
		grade = _grade;
	}
	
	public Student(String _name, int _grade) {
		name = _name;
		grade = _grade;
	}
	
	public void getStudInfo() {
		System.out.println("이름 : " + name +", 학년 : " + grade);
		
	}

}