package sec05.ex03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetSortTest2 {
	public static void main(String[] args) {
		//학생의 시험 점수 순으로 정렬해서 저장
		TreeSet<Student> treeSet1 = new TreeSet<Student>(new ScoreComparator());
		treeSet1.add(new Student("홍길동", 3, 90));
		treeSet1.add(new Student("차범근", 2, 70));
		treeSet1.add(new Student("손흥민", 2, 80));
		treeSet1.add(new Student("유현진", 3, 94));

		Iterator<Student> ite1 = treeSet1.descendingIterator();
		System.out.println("\n시험 점수순으로 이름 출력하기");
		System.out.println("-----------------------------");
		while (ite1.hasNext()) {
			Student s = (Student) (ite1.next());
			System.out.println(s.score + ", " + s.name);
		}
		
		
		
		//학생의 학년 순으로 정렬해서 저장
		TreeSet<Student> treeSet2 = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if(s1.grade > s2.grade) {
					return 1;
				}else if(s1.grade == s2.grade){
					return 1;
//					return 0;
				}else {
					return -1;
				}
			}
		});
		
		treeSet2.add(new Student("홍길동", 1, 90));
		treeSet2.add(new Student("차범근", 3, 70));
		treeSet2.add(new Student("손흥민", 4, 80));
		treeSet2.add(new Student("유현진", 2, 94));
		
		Iterator<Student> ite2 = treeSet2.descendingIterator();
		System.out.println("\n학년순으로 이름 출력하기");
		System.out.println("-----------------------------");
		while (ite2.hasNext()) {
			Student s = (Student) (ite2.next());
			System.out.println(s.grade + ", " + s.name);
		}
	}
}


