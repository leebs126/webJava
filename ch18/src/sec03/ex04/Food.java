package sec03.ex04;

public class Food {
	private static String[] menu = {"돈까스", "오므라이스", "된장찌게", "육개장"};
	String foodName;
	
	public  void  receiveOrder() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("웨이터가 손님에게 주문을 받습니다.");
			}
			
			int menuNum = (int)(Math.random() * 3);
			foodName = menu[menuNum]; //메뉴에서 주문한 음식 이름을 저장합니다.
			
			System.out.println("웨이터가 " + foodName +" 주문을 주방에 전달합니다.\n");
			
			this.notify();
			
			try{
				this.wait();
			}catch(InterruptedException e){}
	
			
			
			
		}
	}

	public  void makeFood() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("주방장이 " + foodName + "를 만듭니다.");
			}
			System.out.println("주방장이 " + foodName+ "를 다 만들었습니다.\n");
			
			this.notify();
			
			try{
				this.wait();
			}catch(InterruptedException e){}

			


		}
	}

}
