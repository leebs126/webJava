package sec05.ex06;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class OperatorTest {
	public static void main(String[] args) {
		IntUnaryOperator iou = (value) -> value * value; // int->int
		LongUnaryOperator lou = (value) -> (long) (value * value); // long->long
		DoubleUnaryOperator duo = (value) -> 3.14 * (value * value); // double->double

		System.out.println(iou.applyAsInt(10)); // 100
		System.out.println(lou.applyAsLong(20L)); // 400L
		System.out.println(duo.applyAsDouble(5)); // 78.5
		System.out.println();

		IntBinaryOperator ibo = (value1, value2) -> value1 + value2; // int->int
		LongBinaryOperator lbo = (value1, value2) -> value1 * value2; // long->long
		DoubleBinaryOperator dbo = (value1, value2) -> value1 / value2; // double->double
		System.out.println(ibo.applyAsInt(10, 20)); // 30
		System.out.println(lbo.applyAsLong(100L, 200L)); // 300L
		System.out.println(dbo.applyAsDouble(111.0, 12.0)); //

	}

}
