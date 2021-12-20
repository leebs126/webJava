package sec02.ex02;

public class WhileCelfahConversionTest {

	public static void main(String[] args) {
		final int BASE = 32;
		float celsius = 0.0f;
		int fahrenheit = 0;

		//while (fahrenheit <= 100) {
		while (true) {
			celsius = (fahrenheit - BASE) * (5.0f / 9.0f);
			System.out.printf("화씨: %d \t  섭씨 : %.3f\n", fahrenheit, celsius);
//			fahrenheit += 10;
		}
		
		

//		for (int fahrenheit = 0; fahrenheit <= 100; fahrenheit += 10) {
//			celsius = (fahrenheit - BASE) * (5.0f / 9.0f);
//			System.out.printf("화씨: %d \t  섭씨 : %.3f\n", fahrenheit, celsius);
//		}

//		for (int fahrenheit = 100; fahrenheit >= 0; fahrenheit -= 10) {
//			celsius = (fahrenheit - BASE) * (5.0f / 9.0f);
//			System.out.printf("화씨: %d \t  섭씨 : %.3f\n", fahrenheit, celsius);
//		}

	}

}
