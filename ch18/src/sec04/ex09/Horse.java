package sec04.ex09;

public class Horse extends Thread {
	private String tName;
	long sleepTime=0;
	
	public void run(){
		tName = getName();
		
		if(tName.equals("경마1")){
			sleepTime=500;
		}else if(tName.equals("경마2")){
			sleepTime=300;
		}else if(tName.equals("경마3")){
			sleepTime=100;
		}
		
		
		try{
				Thread.sleep(sleepTime);
			}catch(Exception e){}
		
		for (int i = 1; i <= 5; i++){
			System.out.println(tName + " 달립니다." );
			
		}
	}
		
}
