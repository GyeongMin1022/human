package chap05;

import java.util.Scanner;

public class 실습문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열 갯수를 입력해주세요");
		int n = scan.nextInt();
		int[] num = new int[n];
		System.out.printf("%d개 숫자를 입력해주세요 \n", n);
		// 배열 생성
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			num[i] = a;
		}
		// 배열 {1,5,2,4}
		// 1. 배열 뒤집기 : {4,2,5,1}
		System.out.print("1. 배열 뒤집기 : ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		// 2. 첫번째 자리에 0 넣기 : {0,1,5,2,4}

		int[] num0 = new int[num.length + 1];
		num0[0] = 0;
		System.out.print("2. 배열에 0 추가 : ");
		for (int i = 1; i <= n; i++) {
			num0[i] = num[(i - 1)];
		}
		for (int i = 0; i < num0.length; i++) {
			System.out.print(num0[i] + " ");
		}
		System.out.println();

		// 3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) : {4, 1, 5, 2}
//		int[] numQ = new int[n];
//		System.out.print("3. 마지막 숫자를 첫번째 넣기");
//		for(int i=1; i<n;i++) {
//			if(i==0) {
//				numQ[i] =num[n-1]; 
//			} else
//			System.out.print(numQ[i]+ " ");
//		}

		// 배열 {3,4,7,5,1,4,6,4,5}
		// 4. 홀수의 갯수와 짝수의 갯수를 각각 출력
		System.out.println("4. 홀수의 갯수와 짝수의 갯수 출력");
		int odd = 0, even = 0;
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.printf("홀수 : %d, 짝수 : %d\n", odd, even);

		// 5. 주어진 수(예를들어 4)보다 큰 숫자의 갯수
		System.out.print("숫자를 입력해주세요");
		int n1 = scan.nextInt();
		int n2 = 0;
		for (int i = 0; i < n; i++) {
			if (num[i] > n1) {
				n2++;
			}
		}

		System.out.printf("%d보다 큰 값의 갯수는 %d개 있습니다 \n", n1, n2);
		// 6. 두번째 최대값
		System.out.print("6.두번째로 큰 값은 : ");
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < i; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = num[i];
				}
			}
		}

		System.out.print(num[n - 2] + " \n");
		// 7. 내림차순으로 정렬
		System.out.printf("7. 내림차순으로 정렬 : ");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < i; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = num[i];
				}
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}System.out.println();
		// 8. 로또 6개 번호(1~45) 중복되지 않게 숫자 선정
		System.out.print("로또 번호 중복되지않게 출력 : ");
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
		    lotto[i] = (int) (Math.random() * 45) + 1;
		    for (int j = 0; j < i; j++) { 
		        if (lotto[i] == lotto[j]) {
		            lotto[i] = (int) (Math.random() * 45) + 1;
		            j = -1;
		        }
		    }
		}
		for (int i = 0; i < lotto.length; i++) {
		    System.out.print(lotto[i] + " ");
		}
		
		
		// 10. 임시비밀번호 8자리 만들기
		// 1) 모두 다 숫자로
		// 2) 모두 다 소문자로 (char ascii)
		// 3) 숫자 2개이상, 대문자 1개이상, 소문자 1개이상 조합
	}

}
