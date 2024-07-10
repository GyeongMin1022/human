package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt(); // 입력값
		int i = 1; // 1부터 곱하기
		int sum = 1; // 계산 값 저장
		while (true) {
			sum *= i;
			if(sum>h) {
				System.out.println(i + " = " + sum);
				break;
			}
			System.out.print(i + " * ");
			

			i++;
		}

	}
}