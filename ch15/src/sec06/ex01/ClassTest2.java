package sec06.ex01;

public class ClassTest2 {
	public static void main(String[] args) throws Exception {
		Class class1 = Student.class;
		String imagePath = class1.getResource("image1.jpg").getPath();
		System.out.println(imagePath);
		

	}

}
