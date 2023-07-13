package sec07.ex04;

import java.util.Scanner;

public class CheckCardTest {

	public static void main(String[] args) {
		CheckCard card = new CheckCard(100000);
		Scanner sc = new Scanner(System.in);
		System.out.println("결제 금액을 입력해 주세요");
		int money = sc.nextInt();
		
		try {
			
			card.payMoney(money);
		} catch (CheckCardException e) {
			String message = e.getMessage();
			System.out.println(message);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
