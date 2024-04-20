package sec03.ex05;

public class Temp extends Employee {
	private int workedHour;

	public Temp(String name, int payPerMonth, int commsion, int workedHour) {
		super(name, payPerMonth, commsion);
		this.workedHour = workedHour;
	}

	@Override
	public int calcTotalPay() {
		// 상위 메서드를 호출하여 총 급여를 구한다.
		// int totalPay=12*payPerMonth+ commsion+ workedHour*2000;
		int temp = super.calcTotalPay();

		// 임시직은 다시 총 일한 시간을 총 급여에 합한 후 구한다.
		int tempTotalPay = temp + workedHour * 2000;
		return tempTotalPay;
	}
}
