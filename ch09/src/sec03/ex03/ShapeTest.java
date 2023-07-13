package sec03.ex03;

public class ShapeTest {

	public static void main(String[] args) {
		int width = 10;
		int height = 20;
		Rect rec = new Rect();
		float area  = rec.calcArea(width, height);
		rec.printArea(area);
		
		System.out.println();
		Tri tri = new Tri();
		area = 1.0f/2.0f * tri.calcArea(width, height);
		tri.printArea(area);

	}

}
