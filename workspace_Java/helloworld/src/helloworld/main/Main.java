package helloworld.main;

public class Main {
	public static void main(String[] args) {
		String[] arr = new String[] { "남", "현", "우", "뒤", "졌", "다" };

		for (int i = 0; i < arr.length * 3; i++) {
			for (int j = 0; j <= i; j++) {
				if (j > 11) {
					System.out.print(arr[j - 12]);
				} else if (j > 5) {
					System.out.print(arr[j - 6]);
				} else {
					System.out.print(arr[j]);
				}
			}
			System.out.println("");
		}
	}
}
