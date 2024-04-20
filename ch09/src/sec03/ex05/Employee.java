package sec03.ex05;

public class Employee {
	protected String name;
	protected int payPerMonth;
	protected int commision;

	public Employee(String name, int payPerMonth, int commision) {
		this.name = name;
		this.payPerMonth = payPerMonth;
		this.commision = commision;
	}

	// 정규직 총 급여 구하기
	public int calcTotalPay() {
		int totalPay = 12 * payPerMonth + commision;
		return totalPay;
	}
}
