package sec05.ex02;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethodTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("홍길동");
		treeSet.add("차범근");
		treeSet.add("손흥민");
		treeSet.add("유현진");
		treeSet.add("손흥민");
		treeSet.add("김유신");
		treeSet.add("홍길동");
		System.out.println(treeSet.toString());  //[김유신, 손흥민, 유현진, 차범근, 홍길동]

		Iterator ite1 = treeSet.iterator();
		System.out.println("\n오름차순으로 출력하기");
		System.out.println("-----------------------------");
		while (ite1.hasNext()) {
			System.out.println(ite1.next());
		}
		
		

		System.out.println("\n내림차순으로 출력하기");
		System.out.println("-----------------------------");
		Iterator ite2 = treeSet.descendingIterator();
		while (ite2.hasNext()) {
			System.out.println(ite2.next());
		}
		
		System.out.println();
		//첫번째 요소 얻기
		String name1 = (String)treeSet.first();  //김유신
		System.out.println(name1);
		
		//마지막 요소 얻기
		String name2 = (String)treeSet.last();  //홍길동
		System.out.println(name2);
		
		//유현진보다 작은 요소들 얻기(유현진 포함되지 않음)
		SortedSet set1 = (SortedSet)treeSet.headSet("유현진");  // [김유신, 손흥민]
		System.out.println(set1);
		
		//유현진보다 큰 요소들 얻기(유현진 포함)
		SortedSet set2 = (SortedSet)treeSet.tailSet("유현진");  // [유현진, 차범근, 홍길동]
		System.out.println(set2);
		
		//손흥민과 유현진 사이의 요소얻기(손흥민은 포함되나, 유현진은 포함되지 않음)
		SortedSet set3 = (SortedSet)treeSet.subSet("손흥민", "차범근");  //[손흥민, 유현진]
		System.out.println(set3);
		
		

	}

}
