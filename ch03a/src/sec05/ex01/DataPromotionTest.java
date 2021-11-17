package sec05.ex01;

public class DataPromotionTest {

	public static void main(String[] args) {
		byte bVar1 = 12;
		int iVar1 = bVar1;  //byte 타입 정수가 int 타입으로 자동 변환된다.  
		System.out.println("iVar1 = " + iVar1);
		
		short sVar1 = 17;
		iVar1 = sVar1;  //short 타입 정수가 int 타입으로 자동 변환된다.
		System.out.println("iVar1 = " + iVar1);

		long lVar1 = bVar1;  //byte타입 정수가 long 타입 정수로 자동 변환된다.
		lVar1 = sVar1; 
		lVar1 = iVar1;   
		System.out.println("lVar1 = " + lVar1);
		
		float fVar1 = lVar1; //long타입 정수가 float 타입 실수로 자동 변환된다.
		System.out.println("fVar1 = " + fVar1);
		
		fVar1 = 103.25F;
		double dVar1 = fVar1; //103.25d로 변환되어서 변수에 저장된다.
		System.out.println("dVar1 = " + dVar1);

	}

}
