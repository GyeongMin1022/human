package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
//		int[] num2 = new int[3];

		for (int i = 0; i < 3; i++) {
			int a = scan.nextInt();
			num[i] = a;
		}

		int max = 0, min = num[0], m1=0;

		for (int i = 0; i < 3; i++) {
			if (max < num[i]) {
				max = num[i];
				num[i] = 0;
			}
			if (min > num[i]) {
				min = num[i];
				num[i] = 0;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (num[i] != 0) {
				m1 = num[i];
			}
		}
		
		System.out.println(m1);

	}
}