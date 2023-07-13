package sec02.ex02;

import java.util.ArrayList;
import java.util.List;

import sec01.ex02.Person;



public class FamilyTest {
	public static void printFamilyName(List<? super Son> list) {
		for (Object obj : list) {
			System.out.println(((Grandfather)obj).getName());
		}
	}

	public static void main(String[] args) {
		List<Grandfather> familyList = new ArrayList<Grandfather>();
		familyList.add(new Grandfather("홍할아버지"));
		familyList.add(new Father("홍아버지"));
		familyList.add(new Son("홍아들"));
		
		printFamilyName(familyList);
		

	}

}
