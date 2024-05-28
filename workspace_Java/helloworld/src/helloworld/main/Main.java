package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int arr[] = new int[a];
		int i, max, min;

		// 입력 받기
		for(i=0;i<a;i++) {
			int b = in.nextInt();
			arr[i] = b;
		}
		max = arr[0];
		min = arr[0];
		
		//최대값 최솟값 받기
		for(i=0;i<a;i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
	
		// 결과값 출력
		System.out.println(min + " " + max);
	}
}