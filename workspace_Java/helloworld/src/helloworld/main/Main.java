package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 값 입력받기
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = scan.nextInt();
		}

		// 오름차순으로 정렬
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 3; j++) {
				if (num[j] < num[i]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;

				}
			}
		}

		// 출력
		System.out.print(num[0] + " ");
		System.out.print(num[1] + " ");
		System.out.println(num[2]);

	}
}