package helloworld.main;

public class Main {
	public static void main(String[] args) {
//      Q5. 5개의 양의 정수를 입력받고, 입력받은 수들을 차례대로 출력하는 프로그램을 작성하세요.
//      이때, 중복된 수는 "한 번만" 출력합니다.(한 번 출력된 수는 다시 출력하지 않습니다)
//      ex1) 입력 : 1 2 3 4 5 -> 출력 : 1 2 3 4 5
//      ex2) 입력 : 1 2 2 3 2 -> 출력 : 1 2 3
//      ex3) 입력 : 1 1 1 1 1 -> 출력 : 1
//      ex4) 입력 : 1 2 1 1 1 -> 출력 : 1 2

		int arr[] = new int[] { 1, 2, 2, 3, 2 };

		for (int i = 0; i < arr.length; i++) {
			int  check = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					check = 0;
					break;
				}
			}
			if (check == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
