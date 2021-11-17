package sec05.ex01;

public class IntTypeCastingTest {

	public static void main(String[] args) {
		byte bVar1 = 12;
		byte bVar2 = 17;
//		byte bVar3 = bVar1 + bVar2;
		byte bVar3 = (byte)(bVar1 + bVar2);
		System.out.println("bVar3 = " + bVar3);
		
//		bVar3 = 10 + 12;
//		bVar3 = 100 + 120;
		bVar3 = (byte)(100 + 120);
		System.out.println("bVar3 = " + bVar3);
		
		short sVar1 = 12;
		short sVar2 = 17;
//		short sVar3 = sVar1 + sVar2;
		short sVar3 = (short)(sVar1 + sVar2);
		System.out.println("sVar3 = " + sVar3);
		
//		sVar3 = 100 + 120;
		sVar3 = (short)(20000 + 22000);
		System.out.println("sVar3 = " + sVar3);
		
		
		int iVar1 = 20000 + 22000;
		System.out.println("iVar1 = " + iVar1);
		
		int iVar2 = (int)(3.141592);
		System.out.println("iVar2 = " + iVar2);
		
		int iVar3 = 5 / 2;
		System.out.println("iVar3 = " + iVar3);
		
		char cVar1 = 'A';
		int iVar4 = (int)cVar1;
		
		System.out.println("iVar4 = " + iVar4);
	}
}
