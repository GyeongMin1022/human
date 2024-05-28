package sec01.exam01;

import java.util.Scanner;

public class For연습 {

	public static void main(String[] args) {

		// 주어진 수가 양수(0포함), 음수 여부 출력
		Scanner scan = new Scanner(System.in);

//		System.out.println("숫자를 입력해주세요");
//		int a = scan.nextInt();
//		//삼항연산자
//		System.out.println((a>=0)?a + "는 양수입니다":a + "는 음수입니다");
//		//if문 사용
//		if(a>=0) {
//			System.out.println(a + "는 양수입니다");
//		} else {
//			System.out.println(a + "는 음수입니다");
//		}
//
//		}

		// 입력을 3번 반복
//		for (int i = 0; i < 3; i++) {
//			System.out.println("숫자를 입력해주세요");
//			int a = scan.nextInt();
//			// 삼항연산자
//			System.out.println((a >= 0) ? a + "는 양수" : a + "는 음수");
//		}

		// 입력받은 숫자가 0이 아닌 동안 계속 반복
		for (int a = 1; a != 0;) {
//			int a = 1;
			System.out.println("숫자를 입력해주세요(종료 : 0)");
			a = scan.nextInt();
			System.out.println((a >= 0) ? a + "는 양수" : a + "는 음수");
		}
		System.out.println("종료되었습니다");

	}

}
