package sec06.ex02;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class AndOrNegateTest {
	public static void main(String[] args) {
		
		IntPredicate predicateA = value -> value > 10;
		IntPredicate predicateB = value -> value < 20;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(15); //15 > 10 && 15 < 20  --> true
		System.out.println(result);
		
		result = predicateAB.test(100);  //100 > 10 && 100 < 20  --> false
		System.out.println(result);
		System.out.println();
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(15); //15 > 10 || 15 < 20  --> true
		System.out.println(result);
		
		result = predicateAB.test(100);  //100 > 10 || 100 < 20  --> true
		System.out.println(result);
		System.out.println();
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(15); //!(15 > 10 || 15 < 20)  --> false
		System.out.println(result);
		
		result = predicateAB.test(100);  //!(100 > 10 || 100 < 20)  --> false
		System.out.println(result);
		System.out.println();
		
		//isEquals();
		Predicate<String> predicateC = Predicate.isEqual("홍길동");
		result = predicateC.test("이순신");
		System.out.println(result);  //false
		
		result = predicateC.test("홍길동");
		System.out.println(result);  //true

	}

}
