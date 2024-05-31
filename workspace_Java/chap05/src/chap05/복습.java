package chap05;

public class 복습 {

	public static void main(String[] args) {
		// 2차원 배열 선언방법
		int[][] arr1 = new int[10][100];
		int[][] arr2 = new int[][] { 
			{ 1, 2, 3 }, 
			{ 1, 2, 3, 5, 6 }, 
			{ 1, 2 } };

		// string 변수비교
		// 가급적 equals를 사용
		String s1 = "박경민";
		String s2 = "박경민";
		System.out.println(s1 == s2); // true of false
		System.out.println(s1.equals(s2)); // true

		// 배열복사 3가지
		// 1. 얕은 복사 (Shallow copy)
		String[] store = new String[] { "apple", "banana", "coffee" };
		String[] store2 = store;
		
		// 출력확인
		System.out.print("store: ");
		for (int i = 0; i < store.length; i++) {
			System.out.print(store[i] + " ");
		} // 결과 : apple banana coffee
		System.out.println();
		System.out.print("store2: ");
		for (int i = 0; i < store2.length; i++) {
			System.out.print(store2[i] + " ");
		} // 결과 : apple banana coffee (복사)

		
		// 2. 깊은복사(Deep Copy)

		// 3. System.arraycopy 이용

		// 향상된 for문 사용
		
		
		// 2차원배열 출력과 합계 구하기
		
		
		// max값 구하기

	}

}
