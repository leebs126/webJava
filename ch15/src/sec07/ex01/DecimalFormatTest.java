package sec07.ex01;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		DecimalFormat  df1 = new DecimalFormat("#,###.#"); //소수점 첫번째 자리까지 표시
		String strNum = df1.format(1222333.44);
		System.out.println(strNum);
		
		DecimalFormat df2 = new DecimalFormat("0.##");
		double d = 123.765;
		System.out.println("기본(반올림) : " + d + " → " + df2.format(d));
		
	}

}
