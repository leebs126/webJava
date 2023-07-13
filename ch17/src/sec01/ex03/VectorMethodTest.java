package sec01.ex03;


import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethodTest {

	public static void main(String[] args) {
		List vList1 = new Vector();
		
		vList1.add("홍길동");
		vList1.add("이순신");
		vList1.add("임꺽정");
		vList1.add("홍길동");
		System.out.println("Vector에 저장된 객체 수 : " + vList1.size());
		System.out.println(vList1.toString());  // [홍길동, 이순신, 임꺽정, 홍길동]
		
		
		//3번째 위치에 추가합니다.
		vList1.add(2, "손흥민");
		
		System.out.println();
		System.out.println("Vector에 저장된 객체 수 : " + vList1.size());
		System.out.println(vList1.toString()); // [홍길동, 이순신, 손흥민, 임꺽정, 홍길동]
		System.out.println();
		
		//배열로 변환합니다.
		Object[] obj = vList1.toArray();
		System.out.println(Arrays.toString(obj)); // [홍길동, 이순신, 손흥민, 임꺽정, 홍길동]
		System.out.println();
		
		List vList2 = new Vector();
		vList2.add(new Integer(1));
		vList2.add(new Integer(2));
		vList2.add(new Integer(3));
		vList2.add(new Integer(4));
		
		vList1.addAll(vList2);
		System.out.println();
		System.out.println("Vector에 저장된 객체 수 : " + vList1.size());
		System.out.println(vList1.toString());   // [홍길동, 이순신, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4]
		
		vList1.addAll(2, vList2);
		System.out.println();
		System.out.println("Vector에 저장된 객체 수 : " + vList1.size());  // 13
		System.out.println(vList1.toString()); //[홍길동, 이순신, 1, 2, 3, 4, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4]
		System.out.println();
		
		vList1.remove(1);  //3번째 객체를 삭제합니다.
		System.out.println("Vector에 저장된 객체 수 : " + vList1.size());  //12
		System.out.println(vList1.toString()); //[홍길동, 1, 2, 3, 4, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4]
		System.out.println();

		vList1.remove("홍길동");  //3번째 객체를 삭제합니다.
		System.out.println("Vector에 저장된 객체 수 : " + vList1.size());  //11
		System.out.println(vList1.toString()); //[1, 2, 3, 4, 손흥민, 임꺽정, 홍길동, 1, 2, 3, 4] 
		
		
		//for문으로 전체 객체 접근하기
		System.out.println();
		for(int i = 0; i <vList1.size(); i++) {
			System.out.println(vList1.get(i));
		}
		
		//모든 객체를 삭제합니다.
		vList1.clear();
		System.out.println("Vector에 저장된 객체 수 : " + vList1.size());  //0
		System.out.println(vList1.toString());  // [ ]
		

	}

}
