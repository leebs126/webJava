package sec06.ex06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class EmployeeTest {
	public static void getEmpInfo(Map<Employee, String> eMap) {

		System.out.println("사원 정보");
		System.out.println("--------------------------------------------------------------------------");
		Set<Employee> eSet = eMap.keySet();
		Object[] obj = eSet.toArray();
		
		for (int i = 0; i < obj.length; i++) {
			Employee key = (Employee) obj[i];
			System.out.println(key.getSabun()+ ", " + key.getName() + ", " + eMap.get(key));
		}
				
		
	}

	public static void main(String[] args) {
		Map<Employee, String> eMap = new HashMap<Employee, String>();
		
		eMap.put(new Employee(20220003, "차범근", "개발부", 2500000), "서울시");
		eMap.put(new Employee(20220005, "박지성", "회계부", 3200000), "인천시");
		eMap.put(new Employee(20220002, "홍길동", "회계부", 3000000), "용인시");
		eMap.put(new Employee(20220004, "유현진", "기획부", 2700000), "서울시");
		eMap.put(new Employee(20220002, "홍길동", "회계부", 3000000), "부산시");
		eMap.put(new Employee(20220003, "차범근", "개발부", 2500000), "대구시");
		
		getEmpInfo(eMap);

	}

}
