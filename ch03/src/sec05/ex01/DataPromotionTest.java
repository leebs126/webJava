package sec05.ex01;

public class DataPromotionTest {

	public static void main(String[] args) {
		byte bVar1 = 12;
		int iVar1 = bVar1;  //12가 int형으로 자동 변환된다.
		System.out.println("iVar : " + iVar1);
		
		short sVar1 = 17;
		iVar1 = sVar1;   //17이 int형으로 자동 변환된다.
		System.out.println("iVar : " + iVar1);
		
		long lVar1 = bVar1 ;
		lVar1 = sVar1 ;
		lVar1 = iVar1 ; //int형 정수가 long형 정수로 자동 변환된다.
		System.out.println("lVar1 : " + lVar1);
		
		System.out.println(lVar1 + 50.5F);  //더 큰 타입의 자료형 연산 시 큰 타입으로 변환된다.
		
		float fVar1 = lVar1;
		System.out.println("fVar1 : " + fVar1);
		
		
		fVar1 = 103.25F;
		System.out.println(fVar1);
		double dVar1 = fVar1;
		System.out.println("dVar1 : " + dVar1);
	}

}
