package helloworld.main;

public class SelectSort {

	public static void main(String[] args) {
		 int arr[] = { 5, 2, 1, 4, 3, 7, 6 };
	        int n = arr.length;
	        
	        // 정렬
	        for (int i = 0; i < n - 1; i++) {
	            int min = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[min]) {
	                    min = j;
	                }
	            }
	            // 최솟값위치와 현재위치를 교환
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }

	        System.out.print("선택 정렬 결과: "); // 1 2 3 4 5 6 7
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}

}
