package sec05.ex01;

public class FloatTypeCastingTest {

	public static void main(String[] args) {
		float fVar1 =  3.25F;
//		fVar1 = 3.25;
		fVar1 = (float)3.25;
		System.out.println("fVar1 = " + fVar1);
		
		float fVar2 = 3.25F + 3.5F;
//		float fVar3 = 3.25F + 3.5;
		System.out.println("fVar2 = " + fVar2);
		
		float fVar3 = (float)(3.25F + 10.5);
		System.out.println("fVar3 = " + fVar3);
		
		double dVar1 = 5.25;
		System.out.println("dVar1 = " + dVar1);
		
		double dVar2 = 13.25f;
		System.out.println("dVar2 = " + dVar2);
		
		double dVar3 = 5.25F + 13.5; 
		System.out.println("dVar3 = " + dVar3);
		
		double dVar4 = 5 / 2.0;
		System.out.println("dVar4 = " + dVar4);
		
		dVar4 = (double)5 / (double)2;
		System.out.println("dVar4 = " + dVar4);
		
		dVar4 = (double)5 / 2;
		System.out.println("dVar4 = " + dVar4);
		
		final float PI = 3.141592f;
		double area = 0.0;
		int radius = 15;

		area = PI * radius * radius;
		System.out.println("원의 넓이 : " + area);

		
	}
}
