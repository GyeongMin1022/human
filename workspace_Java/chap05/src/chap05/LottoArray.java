package chap05;

public class LottoArray {

	public static void main(String[] args) {

		// 6개의 Lotto 번호를 저장하고 싶다.
		int[] lotto = new int[6];
		for (int j = 0; j < 5; j++) { // 5게임 구매
			
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;

			}
		
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		}

		
		// 6개의 Lotto 번호를 저장하고 싶다.
//		int[] lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//			
//		}
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
//			
//		
	}

}
