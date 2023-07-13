package sec04.ex10;

public class Factory implements Runnable {
	private long total = 0; 
	boolean isProduced = false;
	String tName;
	
	@Override
	public void run() {
		synchronized (this) {
			while(true) {	
				
				if (isProduced == false) {
//					tName = Thread.currentThread().getName();
//					System.out.println(tName);
					produce();
					
					
					
					try {
						this.wait();
					} catch (InterruptedException e) {}  //생산자 스레드는 정지상태로 이동합니다.
					
					this.notify();
					
					
				}else if (isProduced == true) {
//					tName = Thread.currentThread().getName();
//					System.out.println(tName);
					
					consume();

					this.notify();   
					try {
						this.wait();
					} catch (InterruptedException e) {}
					
				}
			} //while
		} // synchronized
	} // run

	public void produce() {
		for(int i=1;i<=10;i++) {
			total +=1;
			System.out.println("생산량 = " + total);
		}
		isProduced = true;
		System.out.println();
	}
	
	public void consume() {
		for(int i=10;i>0;i--) {
			total-=1;
			System.out.println("소비량 = " + total);
		}
		isProduced = false;
		System.out.println();
	}
	
	

	
}
