package sec03.ex01;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		System.out.println(3.0 - 2.1);
		System.out.println();
		
		BigDecimal d1 = new BigDecimal("3.00");
		BigDecimal d2 = new BigDecimal("2.1");
		BigDecimal d3 = d1.subtract(d2);
		
		double result1 = d3.doubleValue();
		System.out.println("뺀 결과: " + result1);
		
		BigDecimal d4 = d1.divide(d2, 3, BigDecimal.ROUND_CEILING);
		double result2 = d4.doubleValue();
		System.out.println("나눈 결과 : " + result2);
	}

}
