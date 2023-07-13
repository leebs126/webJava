package sec08.ex02;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
			new Employee("홍길동", 30, "총무부", 2000000),
			new Employee("이순신", 32, "회계부", 3000000),
			new Employee("박지성", 40, "인사부", 4000000),
			new Employee("손흥민", 26, "개발부", 2400000),
			new Employee("차범근", 28, "회계부", 2700000)
		);
		
		double avgSalary = empList.stream()
								.mapToInt(Employee::getSalary)
								.average()
								.getAsDouble();
		
		System.out.println("평균임금: " + avgSalary);
	}

}
