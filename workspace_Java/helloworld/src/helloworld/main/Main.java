package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		 
		int a = in.nextInt();	// 불변 비용
		int b = in.nextInt();	// 가변 비용
		int c = in.nextInt(); 	// 상품 가격
        
		if (c <= b) {
			System.out.println("-1");
		} 
		else {
			System.out.println((a/(c-b))+1);
		}

	}
}