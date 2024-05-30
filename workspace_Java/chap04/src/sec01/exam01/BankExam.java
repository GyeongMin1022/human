package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {

		// 은행 계좌의 잔고 관리 시스템
		// 1.입금 2.출금 3.조회 4.종료
		// 입금 : 잔고에서 더하기
		// **0또는 음수는 실행되지 않게
		// 출금 : 잔액에 더하기
		// **잔액보다 큰 금액은 실행되지 않게 - 잔고가 부족합니다
		// 조회 : 잔액 출력
		// 종료 : 종료

		int balance = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();
			if (select == 1) {
				System.out.print("예금하실금액> ");
				int in = scan.nextInt();
				if (in <= 0) {
					System.out.println("Error : 너무 작은값을 입력하셨습니다");
					continue;
				}
				balance += in;
			} else if (select == 2) {
				System.out.print("출금액> ");
				int out = scan.nextInt();
				if (out > balance) {
					System.out.println("Error : 잔액보다 큰 금액을 인출하셨습니다\n확인해주세요");
					continue;
				}
				balance -= out;
			} else if (select == 3) {
				System.out.println("잔고> " + balance);
			} else if (select == 4) {
				break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다");
				System.out.println("올바른 값을 입력해주세요 (1~4)");
			}
		}
		System.out.println("종료합니다");

	}

}
