package sec08.ex06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLambdaTest {

	public static void main(String[] args) {
		Map<Student, Integer> scoreMap = new HashMap<>();
		scoreMap.put(new Student("홍길동", 2), 90);
		scoreMap.put(new Student("이순신", 3), 80);
		scoreMap.put(new Student("차범근", 1), 77);
		scoreMap.put(new Student("손흥민", 2), 87);
		scoreMap.put(new Student("임꺽정", 1), 99);

		
		//람다식으로  (key, value) 출력하기
		scoreMap.forEach((k,v) -> System.out.println("key=" + k.getName() +", value=" + v));

	}

}
