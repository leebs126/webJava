package sec06.ex01;

public class ClassTest1 {
	public static void main(String[] args) throws Exception {
		//첫 번째 방법
		Class class1 = Student.class;
		
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getPackage().getName());
		System.out.println();
		
		//두 번째 방법
		Class class2 = Class.forName("sec06.ex01.Student");
		
		System.out.println(class2.getName());
		System.out.println(class2.getSimpleName());
		System.out.println(class2.getPackage().getName());
		System.out.println();
		
		//세 번째 방법
		Student s1 = new Student("이순신", 3);
		Class class3 = s1.getClass();
		
		System.out.println(class3.getName());
		System.out.println(class3.getSimpleName());
		System.out.println(class3.getPackage().getName());
		System.out.println();
		
		
		
		
		
		

	}

}
