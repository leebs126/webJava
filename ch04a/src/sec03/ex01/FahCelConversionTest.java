package sec03.ex01;

public class FahCelConversionTest {

	public static void main(String[] args) {
		final int BASE = 32;
		float celsius = 0.0f, fahrenheit = 0.0f;
		
		celsius = 37.0f;
		fahrenheit = celsius * (9.0f / 5.0f) + BASE;
		System.out.println("섭씨 " + celsius +"도에 대한 화씨는 " + fahrenheit + "도입니다.");
		
		celsius = (fahrenheit - BASE) * (5.0f / 9.0f);
		System.out.println("화씨 " + fahrenheit +"도에 대한 섭씨는 " + celsius + "도입니다.");
	}

}
