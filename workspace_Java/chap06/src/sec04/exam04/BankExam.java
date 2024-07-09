package sec04.exam04;

import java.util.*;

public class BankExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank 신한 = new Bank();
		while(true) {
			System.out.println("1. 입금 2.출금 3.잔액확인 4. 종료");
			int n = scan.nextInt();
			int num;
			if (n==1) {
				num = scan.nextInt();
				신한.in(num);
			}
			else if (n==2) {
				num = scan.nextInt();
				신한.out(num);
			}
			else if (n==3) {
				신한.now();
			} else if(n == 4) {
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
			
		}
			
	}

}
