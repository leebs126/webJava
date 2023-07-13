package sec05.ex05;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<String> predicate = (str) -> str.length() > 10 ? true :false;
		boolean result1 = predicate.test("홍길동");
		System.out.println(result1);   //false
		
		IntPredicate intPredicate = (value)->(value % 2 == 0) ? true:false;
		boolean result2 = intPredicate.test(14);
		System.out.println(result2);
		
		LongPredicate longPredicate = (value)->(value > 100) ? true : false;
		boolean result3 = longPredicate.test(50);
		System.out.println(result3);
		
		DoublePredicate doublePredicate = (value)->(value > 1000.0)? true : false;
		boolean result4 = doublePredicate.test(200.6);
		System.out.println(result4);
		
		BiPredicate<String, String> biPredicate = (str1, str2)->str1.equals(str2);
		boolean result5 = biPredicate.test("홍길동","홍길동");
		System.out.println(result5);
		
		boolean result6 = biPredicate.test("홍길동","이순신");
		System.out.println(result6);
		

	}

}
