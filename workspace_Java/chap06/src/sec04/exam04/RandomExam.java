package sec04.exam04;

import java.util.*;

public class RandomExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int n;
		
		while(true) {
			n= scan.nextInt();
			r.answer(n);
			if(r.ok==true) break;
		}
		
	
	}

	
}
