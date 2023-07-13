package sec07.ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionLambdaTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 2));
		studentList.add(new Student("이순신", 1));
		studentList.add(new Student("손흥민", 2));
		studentList.add(new Student("차범근", 3));
		studentList.add(new Student("임꺽정", 2));

		// 학생 이름 출력
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println(student.getName());
		}
		System.out.println();

		// 람다식으로 학생 이름 출력
		studentList.forEach(s -> System.out.println(s.getName()));
		System.out.println();

		// 3학년 학생 이름만 출력
		studentList.removeIf(s -> s.getGrade() == 1 || s.getGrade() == 2);
		studentList.forEach(s -> System.out.println(s.getName()));
		System.out.println();

		studentList.replaceAll(s -> new Student("홍길동", 3));
		studentList.forEach(s -> System.out.println(s.getName()));

		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("홍길동", 90);
		scoreMap.put("이순신", 80);
		scoreMap.put("차범근", 77);
		scoreMap.put("손흥민", 87);
		scoreMap.put("임꺽정", 99);

		//Iterator로 (key,value) 출력하기
		System.out.println();
		Set<String> keySet = scoreMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			int value = scoreMap.get(key);
			System.out.println("key=" + key + ", value=" + value);
		}
		System.out.println();
		
		//람다식으로  (key, value) 출력하기
		scoreMap.forEach((k,v) -> System.out.println("key=" + k +", value=" + v));

	}

}
