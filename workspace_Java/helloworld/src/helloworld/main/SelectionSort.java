package helloworld.main;

public class SelectionSort {

	public static void main(String[] args) {
		 int arr[] = { 5, 2, 1, 4, 3, 7, 6 };
	        
	        // 정렬
	        for (int i = 0; i < arr.length - 1; i++) {
	            int min = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[min]) {
	                    min = j;
	                }
	            }
	            // 최솟값과 현재 위치를 교환
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	            
	            System.out.print(i + 1 + "회전 결과 : ");
	            for (int k = 0; k < arr.length; k++) {
	                System.out.print(arr[k] + " ");
	            }
	            System.out.println();
	        }
	        
	        // 출력
	        System.out.print("선택 정렬 결과: "); // 1 2 3 4 5 6 7
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}

}
