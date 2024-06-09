package helloworld.main;

public class InsertSort {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 4, 3, 7, 6 };
		int n = arr.length;

		// 정렬
		for (int i = 1; i < n; i++) {
			int insert = arr[i];
			int j = i - 1;

			// 숫자를 정렬된 부분에 삽입하기 위해 이동
			while (j >= 0 && arr[j] > insert) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = insert;
		}

		System.out.print("삽입 정렬 결과: "); // 1 2 3 4 5 6 7
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
