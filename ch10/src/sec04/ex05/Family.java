package sec04.ex05;

public class Family {
	public static void main(String[] args) {
		GrandFather grandFather = new Son("이순신", "컴퓨터 공학과");
		Son son = (Son)grandFather;
		son.printName();
		String dept = son.getDept();
		System.out.println("전공 학과명 : " + dept );
		
	}

}
