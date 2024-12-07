package sec01.ex01;

public class BoxTest {

	public static void main(String[] args) {
		Box<Person> box = new Box<Person>();
		box.setData(new Person("손흥민")); 
		System.out.println(box.getData());
		
		box.setData(new Student("홍길동", 3));  
		System.out.println(box.getData());
		
		box.setData(new College("이순신", 2, 23)); 
		System.out.println(box.getData());
	
//		box.setData(new String("안녕하세요!"));
		
//		Box<Student> box2 = new Box<Student>();
//		box2.setData(new Person("손흥민"));
//		box2.setData(new Student("홍길동", 3));		
//		box2.setData(new College("이순신", 2, 23));		
		
		
		

		

	}

}
