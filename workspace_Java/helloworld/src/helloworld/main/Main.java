package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[30];
		int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		
		int i, j;
		// 제출여부 검사
		for (i = 0; i < 28; i++) {
			int input = scan.nextInt();
			arr[i]= input;
			
			for(j=0; j<30; j++) {
				if(arr[i] == arr1[j]) {
					arr1[j] = 0;
				}
				
			}
		}
		scan.close();
		// 제출하지 않은 번호 출력
		for(i=0; i<30; i++) {
			if(arr1[i] > 0) {
				System.out.println(arr1[i]);
			}
		}

	}

}