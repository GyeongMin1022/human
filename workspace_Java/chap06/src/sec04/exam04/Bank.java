package sec04.exam04;

public class Bank {

	int money = 0;
//	boolean a = true;
	
	void in(int m) {
		if(m > 0) {
		money += m;
		System.out.printf("%d원 입금했습니다\n현재잔액 %d원\n",m,money);}
		else {
			System.out.println("잘못된 금액을 입력하셨습니다");
		}
	}
	
	void out(int m) {
		if(m>money) {
			System.out.println("출금할 금액이 입금 할 금액보다 많습니다");
		} else if(m <0) {
			System.out.println("0보다 작은 금액은 출금 할 수 없습니다");
		} else {
			money -= m;
			System.out.printf("%d원 출금했습니다\n현재잔액 %d원\n",m,money);
		}
	}
	
	void now() {
		System.out.printf("현재잔액 %d원\n",money);
	}
	
	
	
	
}
