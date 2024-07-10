package quiz;

import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Charactor p1 = new Charactor();
		Charactor p2 = new Charactor();
		int n;
		int turn = 0;
		while (true) {
			turn++;
			System.out.println("(" + turn + "턴) 1번 플레이어 차례");
			System.out.println("1. 공격 | 2. 회복");
			System.out.print("선택> ");
			n = scan.nextInt();
			if (n == 1) {
				p2.attack((int) (Math.random() * 110) + 10);
			} else if (n == 2) {
				p2.heal((int) (Math.random() * 10) + 5);
			}
			System.out.printf("1번 플레이어 체력 : %d\n2번 플레이어 체력 : %d\n", p1.hp, p2.hp);

			if (p2.hp <= 0) {
				System.out.println("p1이" + turn + "턴 만에 승리했습니다");
				break;
			}

			System.out.println("(" + turn + "턴) 2번 플레이어 차례");
			n = (int) (Math.random() * 2 + 1);
			if (n == 1) {
				p1.attack((int) (Math.random() * 20 + 10));
			} else if (n == 2) {
				p1.heal((int) (Math.random() * 10 + 5));
			}
			System.out.printf("1번 플레이어 체력 : %d\n2번 플레이어 체력 : %d\n", p1.hp, p2.hp);

			if (p1.hp <= 0) {
				System.out.println("p1이" + turn + "턴 만에 승리했습니다");
				break;
			}

		}

	}

}
