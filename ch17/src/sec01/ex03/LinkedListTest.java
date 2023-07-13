package sec01.ex03;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList lList1 = new LinkedList();

		lList1.add("홍길동");
		lList1.add(new Integer(178));
		lList1.add(new Student());
		lList1.add("사과");
		System.out.println(lList1.toString());
		System.out.println();
		
		//삭제하기
		lList1.remove(1);
		System.out.println(lList1.toString());
		System.out.println();
		
		//중간에 추가하기
		lList1.add(1, new Float(3.14F));
		System.out.println(lList1.toString());
		System.out.println();

	}

}
