package chap05;

public class 실습문제10 {
	public static void main(String[] args) {
		// 10-1 8자리 숫자만 출력
		int rand;
		int[] randPass1 = new int[8];
		System.out.print("숫자만 8자리 출력: ");
		for (int i = 0; i < 8; i++) {
			rand = (int) (Math.random() * 10);
			randPass1[i] = rand;
			System.out.print(randPass1[i]);
		}
		System.out.println();

		// 10-2 8자리 소문자만 출력
		char[] randPass2 = new char[8];
		char randChar;
		System.out.print("소문자만 8자리 출력: ");
		for (int i = 0; i < 8; i++) {
			randChar = (char) ((int) (Math.random() * 26) + 97); // 97은 아스키코드 a의 값
			// 즉 97(a)~122(z)까지 값
			randPass2[i] = randChar;
			System.out.print(randPass2[i]);
		}
		System.out.println();

		// 10-3 숫자 2개이상, 대문자 1개이상, 소문자 1개이상 조합
		System.out.print("숫자 2개이상, 대문자 1개이상, 소문자 1개이상 조합 : ");
		// (1) 숫자2 대문자1 소문자1 먼저 생성후 임시저장
		// (2) 나머지 4자리 생성후 임시저장
		// (3) 8자리 순서 랜덤으로 돌려서 저장
		String[] randPass3 = new String[8];
		int num1, num2;
		int[] one = new int[8];
		String[] out = new String[8];
		char a, A;
		// 숫자 0~9 2개 생성
		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);

		a = (char) ((int) (Math.random() * 26) + 97); // 랜덤 소문자 생성
		A = (char) ((int) (Math.random() * 26) + 65); // 랜덤 대문자 생성 (A=65)

		randPass3[0] = num1 + "";
		randPass3[1] = num2 + "";
		randPass3[2] = a + "";
		randPass3[3] = A + "";

		// 나머지 4자리 생성
		for (int i = 0; i < 4; i++) {
			rand = (int) (Math.random() * 3) + 1;
			if (rand == 1) { // 숫자생성
				randPass3[i + 4] = (int) (Math.random() * 10) + "";
			} else if (rand == 2) { // 소문자 생성
				randPass3[i + 4] = (char) ((int) (Math.random() * 26) + 97) + "";
			} else if (rand == 3) { // 대문자 생성
				randPass3[i + 4] = (char) ((int) (Math.random() * 26) + 65) + "";
			}
		}

		// 랜덤 순서 생성
		for (int i = 0; i < 8; i++) {
			one[i] = (int) (Math.random() * 8);
			for (int j = i - 1; j >= 0; j--) {
				if (one[i] == one[j]) {
					one[i] = (int) (Math.random() * 8);
					j = i;
				}
			}
		}

		// 저장된 값을 랜덤한 순서로 출력
		for (int i = 0; i < 8; i++) {
			out[i] = randPass3[one[i]];
			System.out.print(out[i]);

		}

	}
}