package helloworld.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
//		String b = scan.next();
		
		int c, d;
		
		c = a.charAt(2)*100 +  a.charAt(1)*10 + a.charAt(0);
		System.out.println((int)a.charAt(2)*100);
		System.out.println(a.charAt(1)*10);
		System.out.println(a.charAt(0));
		
		System.out.println(c);
	
	}
}