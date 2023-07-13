package sec04.ex04;


public class DataTest {

	public static void main(String[] args) {
		Data d = new Data(5, 5);
//	    d.value = d.x + d.y;
		
		d.setValue();
		int value = d.getValue();
		System.out.println("value : " + value);

	}

}
