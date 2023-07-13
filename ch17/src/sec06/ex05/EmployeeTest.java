package sec06.ex05;

import java.util.ArrayList;
import java.util.List;


public class EmployeeTest {
	public static void getEmpInfo(List<Employee> eList) {
		int sabun = 0;  //사번
		String name = null;
		String dept = null;
		int salary = 0;
		
		System.out.println("사원 정보");
		System.out.println("--------------------------------------------------------------------------");
		for(int i= 0; i< eList.size();i++) {
			Employee emp = eList.get(i);
			sabun = emp.getSabun();
			name = emp.getName();
			dept = emp.getDept();
			salary = emp.getSalary();
			
			System.out.println("사번: " + sabun +
					            ", 사원명: " + name + 
					            ", 근무부서: " + dept + 
					            ", 급여액: " + salary +"원");
		}
		
		
	}

	public static void main(String[] args) {
		List<Employee> eList = new ArrayList<Employee>();
		
		eList.add(new Employee(20220001, "이순신", "총무부", 2000000));
		eList.add(new Employee(20220002, "홍길동", "회계부", 3000000));
		eList.add(new Employee(20220003, "차범근", "개발부", 2500000));
		eList.add(new Employee(20220004, "유현진", "기획부", 2700000));
		eList.add(new Employee(20220005, "박지성", "회계부", 3200000));
		
		getEmpInfo(eList);

	}

}
