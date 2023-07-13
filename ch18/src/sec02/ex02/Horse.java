package sec02.ex02;

public class Horse extends Thread{
	private int horseNum;

	public Horse(int horseNum) {
		this.horseNum = horseNum;
	}

	public void run() {
		long sleepTime =(long)(Math.random() * 500);
		System.out.println(horseNum + "경마 " + sleepTime +"만큼 sleep ..");
		
		try{Thread.sleep(sleepTime);}catch(Exception e){}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(horseNum + "번 경마  " + 100* i +"미터 통과");
		}
		System.out.println(horseNum + "번 경마 " + " 결승선 도착");
	}

}
