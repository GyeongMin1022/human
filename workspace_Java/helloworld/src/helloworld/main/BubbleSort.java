package helloworld.main;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 4, 3, 7, 6 };
		int n = arr.length, 
				temp = 0;

		// 정렬
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("버블정렬 결과 : "); // 1 2 3 4 5 6 7
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
