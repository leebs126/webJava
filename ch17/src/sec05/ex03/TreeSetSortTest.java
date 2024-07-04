package sec05.ex03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetSortTest {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>(new ScoreComparator()) ;
		treeSet.add(new Student("홍길동", 3, 90));
		treeSet.add(new Student("차범근", 2, 70));
		treeSet.add(new Student("손흥민", 2, 80));
		treeSet.add(new Student("유현진", 3, 94));

		Iterator<Student> ite1 = treeSet.descendingIterator();
		System.out.println("\n시험 점수순으로 이름 출력하기");
		System.out.println("-----------------------------");
		while (ite1.hasNext()) {
			Student s = (Student) (ite1.next());
			System.out.println(s.score + ", " + s.name);
		}

	}

}
