package sec06.ex01;

import java.util.function.Function;

public class FunctionAndThenComposeTest {
	public static void main(String[] args) {
		Function<Student, Address> functionA = (s) -> s.getAddress();
		Function<Address, String> functionB = (a) -> a.getCity();
		
		Function<Student, String> functionAB = functionA.andThen(functionB);
		String city1 = functionAB.apply(new Student("홍길동",2,  new Address("대한민국", "서울시")));
		System.out.println(city1);
		
		Function<Student, String> functionBA = functionB.compose(functionA);
		String city2 = functionBA.apply(new Student("이순신",3 ,new Address("대한민국", "대전시")));
		System.out.println(city2);
	}

}
