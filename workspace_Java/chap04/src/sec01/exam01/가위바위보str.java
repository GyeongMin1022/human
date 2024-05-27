package sec01.exam01;

import java.util.Scanner;

public class 가위바위보str {

	public static void main(String[] args) {
		System.out.println("== 가위 바위 보 게임 ==");
		System.out.println("가위 바위 보를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		String player1 = scan.nextLine();
		int player;
		String a = "가위";
		String b = "바위";
		String c = "보위";
		
		if(player1.equals(a)) {
			player = 1;
		}
		else if(player1.equals(b)) {
			player = 2;
		}
		else if(player1.equals(c)) {
			player = 3;
		}
		else {
			player = 4;
		}
		
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
		} else if (player == 3 && computer == 3){
			System.out.println("플레이어 : 보 \n컴퓨터 : 보 ");
			System.out.println("비겼습니다");
		}
		else {
			System.out.println("잘못된 값을 입력하셨습니다 다시 실행해주세요");
		}
	}

}
