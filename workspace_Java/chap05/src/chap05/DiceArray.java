package chap05;

public class DiceArray {

	public static void main(String[] args) {
		// 주사위 두개 합 경우의수
		String[] dice1 = new String[12];
		
		
		for(int i = 1; i<=6 ; i++) {
			for(int j=1;j<=6 ; j++) {
				dice1[i+j-2] = "["+i+", "+j+"]";
			}
		}
		
		for(int i=0;i<12;i++) {
			System.out.print(dice1[i]);
		}

	}

}
