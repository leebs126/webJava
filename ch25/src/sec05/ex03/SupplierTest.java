package sec05.ex03;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<String> nameSupplier = ()-> "홍길동";
		String name = nameSupplier.get();
		System.out.println("이름: " + name);
		
		IntSupplier intSupplier = () -> 17;
		int age = intSupplier.getAsInt();
		System.out.println("나이: " + age);
		
		LongSupplier longSupplier = () -> 3L;
		long grade = longSupplier.getAsLong();
		System.out.println("학년: " + grade);
		
		
		DoubleSupplier doubleSupplier = ()-> 178.7;
		double height = doubleSupplier.getAsDouble();
		System.out.println("키: " + height);
		
		BooleanSupplier booleanSupplier = () -> 10 > 20;
		boolean result = booleanSupplier.getAsBoolean();
		System.out.println("10 > 20 =  " + result);

	}

}
