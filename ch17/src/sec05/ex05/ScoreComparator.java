package sec05.ex05;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		if (s1.score > s2.score) {
			return 1;
		} else if (s1.score == s2.score) {
			return 0;
		} else {
			return -1;
		}

	}
}
