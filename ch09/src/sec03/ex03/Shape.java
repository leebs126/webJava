package sec03.ex03;

public class Shape {
	
	public void printArea(float area) {
		System.out.println("도형 넓이 : " + area);
	}
	
	public float calcArea(float width, float height) {
		float area = width * height;
		return area; 
	}
}
