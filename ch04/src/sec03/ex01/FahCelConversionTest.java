package sec03.ex01;

public class FahCelConversionTest {

	public static void main(String[] args) {
		final int BASE = 32;
		float celsius = 0f, fahrenheit = 0f;
		celsius = 37f;
		
		fahrenheit = celsius * (9.0f / 5.0f) + BASE;
//		fahrenheit = celsius * 9.0f / 5.0f + BASE;
		System.out.println("섭씨 : " + celsius + "도 -> 화씨 : " + fahrenheit + "도");

//		celsius = (fahrenheit - BASE) * 5.0f / 9.0f;
		celsius = (fahrenheit - BASE) * (5.0f / 9.0f);
		System.out.println("화씨 : " + fahrenheit + "도 -> 섭씨 : " + celsius + "도");

	}

}
