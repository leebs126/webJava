package sec07.ex04;

public class CheckCard {
	private int balance;
	
	public CheckCard(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void payMoney(int money) throws CheckCardException{
		if(balance < money) {
			throw new CheckCardException("잔고가 부족합니다.");
		}else {
			System.out.println("정상적으로 결제되었습니다.");
			balance = balance- money;
			System.out.println("잔고 : " + balance+"원");
		}
		
	}

}
