package sec01.ex04;

public class MyMath {
	double avg; // 평균

	// 평균을 구하는 메소드
	public double average(double total, int length) {
		avg = total / length;
		return avg;
	}

	// 소수점을 반올림하는 메소드
	public int round(double _avg) {
		int result = (int) Math.round(_avg);
		return result;
	}
}
