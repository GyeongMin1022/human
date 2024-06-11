package helloworld.main;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 4, 3, 7, 6 };
		

		// 정렬
		for (int i = 1; i < arr.length; i++) {
			int insert = arr[i];
			int j = i - 1;

			// 숫자를 정렬된 부분에 삽입
			while (j >= 0 && arr[j] > insert) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = insert;
			
            System.out.print(i  + "회전 결과: ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
		}

		// 출력
		System.out.print("삽입 정렬 결과: "); // 1 2 3 4 5 6 7
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
