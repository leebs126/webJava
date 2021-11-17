package sec05.ex01;

public class FloatPromotionTest {

	public static void main(String[] args) {
		final float PI = 3.141592f;
		float area = 0.0F, result = 0.0F;
		int radius = 15;

		area = PI * radius * radius;
		System.out.println("원의 넓이 : " + area);

		result = 5 / 2;
		System.out.println(result);

		result = (float) 5 / (float) 2;
		System.out.println(result);

	}

}
