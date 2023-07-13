package sec05.ex04;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Student, String> function = student -> student.getName();

		String name = function.apply(new Student("홍길동", 2));
		System.out.println("학생이름: " + name);

		System.out.println();
		IntFunction<Double> intFunction = value -> (3.28084 * value); // int -> double
		double feet1 = intFunction.apply(3);
		System.out.println("3  --> " + feet1);

		DoubleFunction<Integer> doubleFunction = value -> (int) (value / 3.28084); // double->int
		int meter1 = doubleFunction.apply(feet1);
		System.out.println(feet1 + "  --> " + meter1);

		System.out.println();
		IntToDoubleFunction intDoubleFunction = value -> (int) (value / 3.28084);
		double feet2 = intFunction.apply(3);
		System.out.println("3  --> " + feet2);

		System.out.println();
//		BiFunction<String, Integer, String> biFunction = (name, age)->"전화번호: "+name+", 나이: "+age;
		BiFunction<String, Integer, String> biFunction = (nameValue, ageValue) -> "이름: " + nameValue + ", 나이: " + ageValue;
		String info = biFunction.apply("이순신", 18);
		System.out.println(info);

	}

}
