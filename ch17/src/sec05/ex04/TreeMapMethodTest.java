package sec05.ex04;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethodTest {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("홍길동", "서울시");
		treeMap.put("차범근", "대구시");
		treeMap.put("손흥민", "부산시");
		treeMap.put("유현진", "서울시");
		treeMap.put("박지성", "광주시");
		treeMap.put("이순신", "부산시");
		
		System.out.println(treeMap);  // {박지성=광주시, 손흥민=부산시, 유현진=서울시, 이순신=부산시, 차범근=대구시, 홍길동=서울시}
		System.out.println();
		Map<String, String> map= treeMap.descendingMap(); //key를 역순으로 정렬 
		System.out.println(map);  // {홍길동=서울시, 차범근=대구시, 이순신=부산시, 유현진=서울시, 손흥민=부산시, 박지성=광주시}
		
		Set<String> set1 = treeMap.keySet();
		Iterator<String> ite1 = set1.iterator();
		System.out.println("\n오름차순 key로 출력하기");
		System.out.println("-----------------------------");
		while (ite1.hasNext()) {
			String key = (String) ite1.next();
			String value = (String) treeMap.get(key);
			System.out.println(key + "=" + value);
		}

		System.out.println();
		System.out.println("\n내림차순 key로 출력하기");
		System.out.println("-----------------------------");
		Set set2= treeMap.descendingKeySet();
		Iterator<String> ite2 = set2.iterator();
		while (ite2.hasNext()) {
			String key = (String) ite2.next();
			String value = (String) treeMap.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println();
		
		//첫번째 키 얻기
		String name1 = (String)treeMap.firstKey();  // 박지성
		System.out.println(name1);
		
		//마지막 키 얻기 
		String name2 = (String)treeMap.lastKey();  // 홍길동
		System.out.println(name2);
		System.out.println();
		
		//유현진보다 작은 키 얻기 
		SortedMap<String, String> map1 = (SortedMap)treeMap.headMap("유현진");  //{박지성=광주시, 손흥민=부산시}
		System.out.println(map1);
		
		//유현진보다 큰 키 얻기(유현진 포함)
		SortedMap<String, String> map2 = (SortedMap)treeMap.tailMap("유현진");  // {유현진=서울시, 이순신=부산시, 차범근=대구시, 홍길동=서울시}
		System.out.println(map2);
		
		//손흥민과 차범근 사이의 키 얻기(손흥민은 포함되나, 차범근은 포함안됨
		SortedMap<String, String> map3 = (SortedMap)treeMap.subMap("손흥민", "차범근");  //{손흥민=부산시, 유현진=서울시, 이순신=부산시}
		System.out.println(map3);

		

	}

}
