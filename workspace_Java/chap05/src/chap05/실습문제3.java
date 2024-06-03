package chap05;

public class 실습문제3 {

	public static void main(String[] args) {
		// 배열 {1,5,2,4}를 {4,1,5,2}로 변경
		int[] array = { 1, 5, 2, 4};
		int n = array.length;
		int[] array3 = new int[n];

		for (int i = 0; i < n; i++) {
			array3[(i + 1) % n] = array[i];
		} // 나머지 활용
		
		for (int i = 0; i < n; i++) {
			System.out.print(array3[i] + " ");
		}System.out.println();
		
		for (int i = 0; i < n; i++) {
			array[(i + 1) % n] = array3[i];
		} // 나머지 활용
		
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}System.out.println();

		for (int i = 0; i < n; i++) {
			array3[(i + 1) % n] = array[i];
		} // 나머지 활용
		
		for (int i = 0; i < n; i++) {
			System.out.print(array3[i] + " ");
		}System.out.println();

		

	}

}
