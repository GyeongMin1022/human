package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int score = 91;

		if (score >= 90) {
			System.out.println("90점 이상입니다.");
			if (score >= 95) {
				System.out.println("95점 이상입니다.");
			}
		}

		if (score < 90) {
			System.out.println("90점 미만입니다.");
		}

		// 참고
		boolean up90 = score >= 90;
		if (up90) {
			System.out.println("up90");
		}
		if (!up90) {
			System.out.println("!up90");
		}
		if (up90) {
			System.out.println("참");
		} else {
			// 위의 조건이 하나도 만족하지 않는 경우 무조건 실행.
			System.out.println("거짓");
		}

		System.out.println("===========================================");
		if (score >= 90) {
			System.out.println("학점은 A");
		} else if (score > 80) {
			System.out.println("학점은 B");
		} else {
			System.out.println("학점은 C");
		}

		// if, else if, else로 묶여있으면 그중 하나만 실행된다
		if (score >= 90) {
			System.out.println("학점은 A");
		} else if (score > 80) {
			// 위의 조건이 거짓 일 경우만 이곳으로 온다(else if)
			System.out.println("학점은 B");
		} else {
			System.out.println("학점은 C");
		}

		System.out.println("===========================================");
		if (score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("학점은 A");
		}
		// 위 if와 관계 없이 동작
		if (score >= 80) {
			System.out.println("90점 미만 80점 이상 입니다");
			System.out.println("학점은 B");
		}

		// 3은 짝수인가?
		int num = 4;
		Scanner input = new Scanner(System.in);
////		num = input.nextInt();
//		if(num%2==0) {
//			System.out.println("짝수 입니다");
//		} else {
//			System.out.println("홀수 입니다");
//		}

		System.out.println("===========================================");
//		String a = "abc";
//		String b = "abc";
//		b= input.nextLine();
//		
//		if(a.equals(b)) {
//			System.out.println("a와 b가 같다");
//		} else {
//			System.out.println("a와 b가 다르다");
//		}
		double rand = Math.random();
		System.out.println("rand : " + rand);
		// 0이상 1 미만

		// 주사위 : 1~6까지
		int dice = (int) (Math.random() * 1000) % 6 + 1;
		System.out.println("주사위 값은 : " + dice);

		System.out.println();
		System.out.println("== 가위 바위 보 게임 ==");
		System.out.println("가위 바위 보를 입력해주세요");
		System.out.println("가위: 1 / 바위 : 2 /보 : 3");
		Scanner scan = new Scanner(System.in);
		int player = scan.nextInt();
		int computer = (int) (Math.random() * 1000) % 3 + 1;

		// 가위일때
		if (player == 1 && computer == 1) {
			System.out.println("플레이어 : 가위 \n컴퓨터 : 가위 ");
			System.out.println("비겼습니다");
		} else if (player == 1 && computer == 2) {
			System.out.println("플레이어 : 가위 \n컴퓨터 : 바위 ");
			System.out.println("졌습니다");
		} else if (player == 1 && computer == 3) {
			System.out.println("플레이어 : 가위 \n컴퓨터 : 보 ");
			System.out.println("이겼습니다");
		} 
		
		// 바위 일때
		else if (player == 2 && computer == 1) {
			System.out.println("플레이어 : 바위 \n컴퓨터 : 가위 ");
			System.out.println("이겼습니다");
		} else if (player == 2 && computer == 2) {
			System.out.println("플레이어 : 바위 \n컴퓨터 : 바위 ");
			System.out.println("비겼습니다");
		} else if (player == 2 && computer == 3) {
			System.out.println("플레이어 : 바위 \n컴퓨터 : 보 ");
			System.out.println("졌습니다");
		} 
		
		//보 일때
		else if (player == 3 && computer == 1) {
			System.out.println("플레이어 : 보 \n컴퓨터 : 가위 ");
			System.out.println("졌습니다");
		} else if (player == 3 && computer == 2) {
			System.out.println("플레이어 : 보 \n컴퓨터 : 바위 ");
			System.out.println("이겼습니다");
		} else if(player == 3 && computer == 3) {
			System.out.println("플레이어 : 보 \n컴퓨터 : 보 ");
			System.out.println("비겼습니다");
		}
		// 이상한 값을 입력했을때
		else {
			System.out.println("잘못된 값을 입력했습니다 \n프로그램을 종료합니다");
		}

	}

}
