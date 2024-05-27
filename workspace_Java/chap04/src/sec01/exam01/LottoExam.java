package sec01.exam01;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double rand = Math.random();
		// 0이상 1미만
//		0 < = rand && rand < 1
		System.out.println("몇 게임을 구매하시겠습니까?");
		int a = scan.nextInt();
		
		
		
		for(int i = 0 ; i <a; i++) {
		rand = Math.random();
		int number = (int) (rand * 45) + 1;
		System.out.print(number+ " ");
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.print(number + " ");
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.print(number+ " ");
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.print(number+ " ");
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
		
		}
		
		
			
	}

}
