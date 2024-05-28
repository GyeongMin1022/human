package sec01.exam01;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {

		// 1씩 증가하는 걸 5번 반복
		int sum = 0;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println(sum);

		// 참고로 1~n까지 더한 값
		// n * (n + 1) / 2
		// 1+ 2+ 3+ 4+ 5
		sum = 0;
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		System.out.println(sum);

		// 1, 2, 3에 해당하는 걸 변수에 넣어보자
		sum = 0;
		int i = 0; // 초기화식
		i++;// i = 1, 증감식
		sum = sum + i;
		i++; // i = 2, 실행문
		sum = sum + i;
		i++; // i = 3
		sum = sum + i;
		i++; // i = 4
		sum = sum + i;
		i++; // i = 5
		sum = sum + i;
		i++; // i = 6
		System.out.println(sum);

		// 반복문 만드는 원리
		// 반복 되는것 찾기 Ctrl + c, v 해도 바뀌지 않는 것.
		//
		// 반복 되지 않는 것
		// 패턴(규칙)을 찾을 수 있다면 반복문으로 만들 수 있음
		//
		// 반복 되지 않는것의
		// 시작조건 찾기
		// 종료 조건 찾기
		//
		// for : 반복 횟수를 아는 경우
		// while : 반복 횟수를 모르는 경우

		/*
		 * 맨 처음 한번만 초기화식 실행 조건이 참이면 실행블럭 실행하고 증감식 실행하고 다시 조건 보기 반복 for(초기화식; 조건; 증감식){
		 * 실행블럭 }
		 */

		int sum2 = 0;
		for (int e = 1; e <= 10000; e++) {
			sum2 += e;
//			System.out.println("안쪽에서 e : "+e + ",  sum2 :  " + sum2 );
		}
		System.out.println("for 사용 sum2 : " + sum2);

		// 1~10의 합
		System.out.println();
		int result = 0;
		for (i = 1; i <= 10; i++) {
			result += i;
		}
		System.out.println("1부터 10까지의 합은 " + result + "입니다");

		// 1~10까지 출력
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		/*
		 * 반복되는걸 찾기 쉬운 방법 일단 복사합니다 그리고 붙여넣습니다 마지막으로 변경하는 규칙도 찾습니다 변경되는걸 변수로 바꿉니다
		 */

		// 짝수만 출력하기
		// 1. 증감식 이용하기
		System.out.println("1. 증감식 이용하기");
		result = 0;
		for (i = 2; i <= 10; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("----------");

		// 2. if문 이용하기
		System.out.println("2. if문 이용하기");
		result = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("----------");

		// 3. 1~10까지 한줄에 3개
		System.out.println("3. 1~10까지 한줄에 3개");
		result = 0;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if (i % 3 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("----------");

		// 1~100까지 3의 배수가 몇개 있는가
		int count = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		System.out.println("1~100중 3의 배수는 " + count + "개 입니다.");

		// 구구단 2단부터 찍기
		for (i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

		System.out.println("2 * 1 = 2");
		System.out.println();

		// 구구단 2단
		for (i = 1; i < 10; i++) {
			System.out.printf("2 * %d = %d\n", i, 2 * i);
		}
		for (i = 1; i < 10; i++) {
			System.out.printf("3 * %d = %d\n", i, 3 * i);
		}


		System.out.println("몇단 피라미드를 쌓으시겠습니까?");
		// 피라미드 찍기
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int j, k;
		for (i = 0; i < num; i++) {
			for (j = num - 1 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		
		

	}

}
