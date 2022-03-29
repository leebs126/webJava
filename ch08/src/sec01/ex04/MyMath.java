package sec01.ex04;

public class MyMath {
	double avg ; 
	
	public double average(double total, int length) {
		avg = total / length;
		return avg;
	}
	
	public int round(double _avg) {
		int result = (int)Math.round(_avg);
		return result;
	}

}
