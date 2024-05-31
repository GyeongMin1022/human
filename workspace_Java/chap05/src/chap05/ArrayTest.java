package chap05;

public class ArrayTest {

	public static void main(String[] args) {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		System.out.println("1단계 전부 출력");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("2단계 합계 계산");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}

		}

		System.out.println(" 합계: " + sum + "\n");
		System.out.println("3단계 평균 출력");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				count++;
			}

		}
		avg = (double) sum / count;
		System.out.println("평균: " + avg + "\n");

		
//		배열의 첫번째 값부터 혹은 절대 나올수 없는 최저치를 기준으로
//		기준으로 비교해서 
//		큰 값을 새로운 기준으로 정한다
		System.out.println("4번문제");
		int max = 0, // Integer.MIN_VALUE;(int가 가질수 있는 최소값)
				rank=0 ,i;
		int[] array2 = { 1, 5, 3, 8, 2 };
		for (i = 0; i < array2.length; i++) {
			if (max < array2[i]) {
				max = array2[i];
				rank = i;
			}
		}

		System.out.println("max : " + max + "\n" + (rank + 1) + "번째");
	}

}
