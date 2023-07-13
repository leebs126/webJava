package sec03.ex05;

public class Employee {
	protected String name;
	protected int payPerMonth;
	protected int commsion;

	public Employee(String name, int payPerMonth, int commsion) {
		this.name = name;
		this.payPerMonth = payPerMonth;
		this.commsion = commsion;
	}

	// 정규직 총 급여 구하기
	int calcTotalPay() {
		int totalPay = 12 * payPerMonth + commsion;
		return totalPay;
	}
}
