package sec01.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethodTest {

	public static void main(String[] args) {
		List aList1 = new ArrayList();
		aList1.add("홍길동");
		aList1.add("이순신");
		aList1.add("임꺽정");
		aList1.add("홍길동");
		System.out.println("ArrayList에 저장된 객체 수 : " + aList1.size());
		System.out.println(aList1.toString());  // [홍길동, 이순신, 임꺽정, 홍길동]
		
		//3번째 위치에 추가합니다.
		aList1.add(2, "손흥민");
		
		System.out.println();
		System.out.println("ArrayList에 저장된 객체 수 : " + aList1.size());
		System.out.println(aList1.toString()); // [홍길동, 이순신, 손흥민, 임꺽정, 홍길동]
		System.out.println();
		
		//배열로 변환합니다.
		Object[] obj = aList1.toArray();
		System.out.println(Arrays.toString(obj)); // [홍길동, 이순신, 손흥민, 임꺽정, 홍길동]
		System.out.println();
		
		List aList2 = Arrays.asList(obj);  //배열을 List로 변환합니다.
		
		List aList3 = new ArrayList();
		aList3.add(new Integer(1));
		aList3.add(new Integer(2));
		aList3.add(new Integer(3));
		aList3.add(new Integer(4));
		
		aList1.addAll(aList3);
		System.out.println();
		System.out.println("ArrayList에 저장된 객체 수 : " + aList1.size());
		System.out.println(aList1.toString());   // [홍길동, 이순신, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4]
		
		aList1.addAll(2, aList3);
		System.out.println();
		System.out.println("ArrayList에 저장된 객체 수 : " + aList1.size());  // 13
		System.out.println(aList1.toString()); //[홍길동, 이순신, 1, 2, 3, 4, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4]
		System.out.println();
		
		aList1.remove(1);  //2번째 객체를 삭제합니다.
		System.out.println("ArrayList에 저장된 객체 수 : " + aList1.size());  //12
		System.out.println(aList1.toString()); //[홍길동, 1, 2, 3, 4, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4]
		System.out.println();

		aList1.remove("홍길동");  //1번째 요소를 삭제합니다.
		System.out.println("ArrayList에 저장된 객체 수 : " + aList1.size());  //11
		System.out.println(aList1.toString()); //[1, 2, 3, 4, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4] 
		System.out.println();		
		
		//for문으로 전체 객체 접근하기
		for(int i = 0; i <aList1.size(); i++) {
			System.out.println(aList1.get(i));
		}
		
		//모든 객체를 삭제합니다.
		aList1.clear();
		System.out.println("ArrayList에 저장된 객체 수 : " + aList1.size());  //0
		System.out.println(aList1.toString());  // [ ]
		

	}

}
