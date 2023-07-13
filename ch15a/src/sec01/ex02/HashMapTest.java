package sec01.ex02;

import java.util.HashSet;
import java.util.Set;

import sec01.ex01.Employee;

public class HashMapTest {

	public static void main(String[] args) {
		Set set =new HashSet();
		Employee e1 = new Employee(100);
		Employee e2 = new Employee(100);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		set.add(e1);
		set.add(e2);
		
		

		System.out.println(set);
	}

}
