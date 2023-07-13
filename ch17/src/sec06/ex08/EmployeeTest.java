package sec06.ex08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {
	
	public static void getEmpInfo(Map<String, List<Employee>> eMap) {
		System.out.println("  사번     이름   급여액");
		System.out.println("---------------------------");
		Set<String> eSet = eMap.keySet();
		Iterator<String> ite1 = eSet.iterator();
		while(ite1.hasNext()) {
			String key = ite1.next();
			List<Employee> empList = (List<Employee>) eMap.get(key);
			for(int i=0; i< empList.size();i++) {
				Employee emp = empList.get(i);
				System.out.println(key + ", " + emp.getName() + ", " + emp.getSalary() +"원");
			}
		
			
		}
		
	}

	public static void main(String[] args) {
		Map<String, List<Employee>> eMap = new HashMap<String, List<Employee>>();
		List<Employee> eList1 = new ArrayList<Employee>();
		eList1.add(new Employee(20220003, "이순신", "개발부", 3500000));
		eList1.add(new Employee(20220004, "차범근", "개발부", 2500000));
		eList1.add(new Employee(20220005, "박지성", "개발부", 3000000));
		eMap.put("서울시", eList1);
		
		List<Employee> eList2 = new ArrayList<Employee>();
		eList2.add(new Employee(20220003, "홍길동", "인사부", 2500000));
		eList2.add(new Employee(20220003, "유현진", "인사부", 2400000));
		eList2.add(new Employee(20220003, "임꺽정", "인사부", 3700000));
		eMap.put("인천시", eList2);
		
		getEmpInfo(eMap);

	}

}
