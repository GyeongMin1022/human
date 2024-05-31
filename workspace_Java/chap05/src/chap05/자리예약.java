package chap05;

import java.util.Scanner;

public class 자리예약 {

	public static void main(String[] args) {
		// 9. 자리예약
		// 자리가 10개 있는 소극장 예약 시스템
		// 1~10번호의 자리가 있음
		// 예약할 자리는 하고 입력받음
		// 예약할 자리가 있으면 예약했습니다 출력
		// 불가능하면 이미 예약되었습니다
		// 남은 자리 출력
		Scanner scan = new Scanner(System.in);

		int[] ok = new int[10];

		while (true) {
			System.out.println("--------------소극장 예약-------------");
			System.out.println("1. 예약하기 | 2. 잔여좌석 확인|3. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			int a = scan.nextInt();
			if (a == 1) {
				System.out.println("예약할 자리 번호를 입력해주세요");
				System.out.print("좌석번호 >");
				int b = scan.nextInt();
				if (ok[b - 1] == 1) {
					System.out.println("이미 예약된 좌석입니다 다시 선택해주세요");
				} else {
					ok[b - 1] = 1;
					System.out.println("예약이 완료되었습니다");
				}

			} else if (a == 2) {
				System.out.println("남은좌석");
				for (int i = 0; i < 10; i++) {
					if (ok[i] == 0) {
						System.out.printf("%d번 ", i + 1);
					}
				}
				System.out.println("좌석 남았습니다");

			} else {
				System.out.println("종료합니다");
				break;
			}
		}

	}

}
