package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (b < 45) {
			a -= 1;
			b += 60;
		}
		b-=45;
		if(a == -1) {
			a =23;
		}
		
		
		System.out.println(a + " " + b);
		
		

	}

}