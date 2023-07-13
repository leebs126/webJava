package sec03.ex05;

public class Restaurant {
	public static void main(String[] args) {
		Food food = new Food();
		Waitor waitor = new Waitor(food);
		waitor.setName("웨이터");
		
		Chef chef1 = new Chef(food);
		chef1.setName("한식 주방장");
		
		Chef chef2 = new Chef(food);
		chef2.setName("중식 주방장");
		
		waitor.start();
		chef1.start();
		chef2.start();
		
	}

}
