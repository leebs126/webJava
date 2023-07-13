package sec02.ex01;

import java.util.ArrayList;
import java.util.List;

import sec01.ex02.Person;



public class FamilyTest {
	public static void printFamilyName(List<? extends Father> list) {
		for (Grandfather family : list) {
			System.out.println(family.getName());
		}
	}

	public static void main(String[] args) {
		List<Father> familyList = new ArrayList<Father>();
//		familyList.add(new Grandfather("홍할아버지"));
		familyList.add(new Father("홍아버지"));
//		familyList.add(new Uncle('홍삼촌"));
		familyList.add(new Son("홍아들"));
		
		printFamilyName(familyList);
		

	}

}
