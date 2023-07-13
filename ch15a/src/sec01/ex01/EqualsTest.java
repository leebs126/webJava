package sec01.ex01;

public class EqualsTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(100);
		Employee e2 = new Employee(100);

		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		System.out.println(e1.equals(e2)); // false

	}

}
