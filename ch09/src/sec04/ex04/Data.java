package sec04.ex04;

public class Data {
	private int x = 5, y = 6;
	private int value;
	
	public Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void setValue() {
		value = x + y;
	}
	
	public int getValue() {
		return value;
	}

}
