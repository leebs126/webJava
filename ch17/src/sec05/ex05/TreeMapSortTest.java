package sec05.ex05;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortTest {
	public static void main(String[] args) {
		TreeMap<Student,String> treeMap = new TreeMap<>(new ScoreComparator());
		treeMap.put(new Student("홍길동", 3, 90), "서울시");
		treeMap.put(new Student("차범근", 2, 70), "대구시");
		treeMap.put(new Student("손흥민", 2, 80), "부산시");
		treeMap.put(new Student("유현진", 3, 94), "서울시");
		
		Set<Student> set1 = treeMap.keySet();
		Iterator<Student> ite1 = set1.iterator();
		System.out.println("\n시험 점수순으로 주소 출력하기");
		System.out.println("-----------------------------");
		while (ite1.hasNext()) {
			Student key = ite1.next();
			String value = treeMap.get(key);
			System.out.println(key.score + " = " + value);
		}

	}

}
