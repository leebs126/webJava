package sec04.ex07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ProductGenericTest {

	public static void getProdInfo(Map<String, List<Product>> pMap) {
		Product prod = null;
		String code = null;
		String name = null;
		String color = null;
		int qty = 0;
		
		Set<String> employee = pMap.keySet();
		Iterator<String> ite1 = employee.iterator();
		
		System.out.println("제품 정보 출력\n");
		while(ite1.hasNext()) {
			String employeeName = ite1.next();
			System.out.println("담당자 : " + employeeName);
			System.out.println("--------------------------------");
			List<Product> pList = pMap.get(employeeName);
			
			
			for (int i = 0; i < pList.size(); i++) {
				prod = pList.get(i);
				code = prod.getCode();
				name = prod.getName();
				color = prod.getColor();
				qty = prod.getQty();

				System.out.println("제품번호 = " + code);
				System.out.println("제품이름 = " + name);
				System.out.println("제품색상 = " + color);
				System.out.println("제품수량 = " + qty);
				System.out.println();
			} //end for
		} //end while
	}

	public static void main(String[] args) {
		Map<String ,List<Product>> pMap = new HashMap<String, List<Product>>();
//		Map<String ,List<Product>> pMap = new TreeMap<String, List<Product>>();
		
		List<Product> pList1 = new ArrayList<Product>();
		Product p1 = new Product();
		Product p2 = new Product("0002", "스마트 TV", "흰색", 200);
		Product p3 = new Product("0003", "노트북", "은색", 100);
		pList1.add(p1);
		pList1.add(p2);
		pList1.add(p3);
		pMap.put("이순신", pList1);
		
		List<Product> pList2 = new ArrayList<Product>();
		pList2.add(new Product());
		pList2.add(new Product("0004", "스마트폰", "블랙", 500));
		pList2.add(new Product("0005", "OLED TV", "블루", 200));
		pMap.put("홍길동", pList2);
		
		getProdInfo(pMap);
		

	}

}
