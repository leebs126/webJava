package sec03.ex04;

public class Tri extends Shape {
	public Tri() {
		System.out.println("Tri 클래스 기본 생성자 호출");
	}

	@Override
	public float calcArea(float width, float height) {
		float area = 1.0f/2.0f * width * height;
		return area; 
	}
	
	
}
