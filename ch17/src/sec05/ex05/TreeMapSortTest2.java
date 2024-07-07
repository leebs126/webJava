package sec05.ex05;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortTest2 {
	public static void main(String[] args) {
		TreeMap<Student, String> treeMap1 = new TreeMap<>(new ScoreComparator());
		treeMap1.put(new Student("홍길동", 3, 90), "서울시");
		treeMap1.put(new Student("차범근", 2, 70), "대구시");
		treeMap1.put(new Student("손흥민", 2, 80), "부산시");
		treeMap1.put(new Student("유현진", 3, 94), "서울시");
		
		Set<Student> set1 = treeMap1.keySet();
		Iterator<Student> ite1 = set1.iterator();
		System.out.println("\n시험 점수순으로 주소 출력하기");
		System.out.println("-----------------------------");
		while (ite1.hasNext()) {
			Student key = ite1.next();
			String value = treeMap1.get(key);
			System.out.println(key.score + " = " + value);
		}

		//익명 객체로 TreeMap의 학년순으로 키 정렬 하기
		TreeMap<Student, String> treeMap2 = new TreeMap<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.grade > s2.grade) {
					return 1;
				} else if (s1.grade == s2.grade) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		
		treeMap2.put(new Student("홍길동", 3, 90), "서울시");
		treeMap2.put(new Student("차범근", 2, 70), "대구시");
		treeMap2.put(new Student("손흥민", 4, 80), "부산시");
		treeMap2.put(new Student("유현진", 1, 94), "서울시");
		
		
		Set<Student> set2 = treeMap2.keySet();
		Iterator<Student> ite2 = set2.iterator();
		System.out.println("\n학년별로 주소 출력하기");
		System.out.println("-----------------------------");
		while (ite2.hasNext()) {
			Student key = ite2.next();
			String value = treeMap2.get(key);
			System.out.println(key.grade + " = " + value);
		}
	}
}
