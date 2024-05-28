package sec01.exam01;

import java.util.Scanner;

public class For문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i, j, k;
		// 0단계
		System.out.println("0단계");
		for (i = 0; i < num; i++) {
			System.out.println("+");
		}

		// 1단계
		System.out.println("1단계");
		for (i = 0; i < num; i++) {
			System.out.print("+");
		}
		System.out.println();

		// 2단계
		System.out.println("2단계");
		for (i = 0; i < num; i++) {
			for (j = 0; j < num; j++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// 2-1단계
		System.out.println("2-1단계");
		for (i = 0; i < num; i++) {
			System.out.print("+");
			System.out.print(" ");
		}
		System.out.println();

		// 3단계
		System.out.println("3단계");
		for (i = 0; i < num; i++) {
			for (j = 0; j <= i; j++) {

				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();

		// 4단계
		System.out.println("4단계");
		for (i = 0; i < num; i++) {

			for (j = 0; j < i; j++) {
				System.out.print("+");
			}
			for (k = num; k > i; k--) {
				System.out.print(".");
			}
			System.out.println();
		}
		System.out.println();

		// 5단계
		System.out.println("5단계");
		for (i = 0; i < num; i++) {

			for (j = num; j > i; j--) {
				System.out.print(".");
			}
			for (k = 0; k < i; k++) {
				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();

		// 6단계
		System.out.println("6단계");
		for (i = 0; i < num; i++) {
			for (j = num - 1 - i; j > 0; j--) {
				System.out.print(".");
			}
			for (k = 0; k < i*2+ 1; k++) {
				System.out.print("+");
			}

			System.out.println();

		}
		System.out.println();
		// 7단계
		System.out.println("7단계");
		for (i = 0; i < num; i++) {
			for (j = num - 1 - i; j > 0; j--) {
				System.out.print(".");
			}
			for (k = 0; k < i*2 + 1; k++) {
				System.out.print("+");
			}
			for (j = num - 1 - i; j > 0; j--) {
				System.out.print(".");
			}

			System.out.println();

		}
		System.out.println();
		// 7-1 마름모찍기


		// 구구단 한 단을 옆으로 출력

		System.out.println("구구단 1단계");
		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d ", i, j, i * j);
			}
			System.out.println();
		}
		// 구구단 옆으로 3단씩 출력
		// 2+1 3+1 4+1
		// .. .. ..
		System.out.println("구구단 2단계");
		for (k = 2; k <= 10; k = k + 3) {
			for (i = 1; i < 10; i++) {
				for (j = k; j < k + 3; j++) {
					if (j == 10)
						break;
					System.out.print(j + " * " + i + " = " + j * i + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
		// 주사위 두개 굴림
		// 1단계 : 주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력
		System.out.println("===주사위 1단계===");
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= 6; j++) {
				System.out.printf("[%d , %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println();
		
		// 2단계 : 합 별로 나올 수 있는 조합
		System.out.println("===주사위 2단계===");
		for (i = 2; i <= 12; i++) {
			System.out.print("합" + i + " : ");
			for (j = 1; j <= 6; j++) {
				for (k = 1; k <= 6; k++) {
					if (j + k == i) {
						System.out.printf("[%d, %d]", j, k);
					}

				}
			}
			System.out.println();
		}
		
		System.out.println("끝났습니다.");

	}

}
