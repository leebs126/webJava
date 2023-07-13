package sec05.ex03;


public class Student  {
	String name;
	int grade;
	int score;  //시험점수


	Student(){ } 
	Student(String name, int grade, int score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
}
