package sec02.ex01;

public class Outter {
	
	public void startChat() {
		class ChattingThread  {
			public void SendData() {
				System.out.println("메시지를 송신합니다.");
			}
			public void receiveData() {
				System.out.println("메시지를 수신합니다.");
			}
		}
		
		ChattingThread chat = new ChattingThread();
		chat.SendData();
		chat.receiveData();
	}
	
	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.startChat();
	}
}
