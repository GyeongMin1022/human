package helloworld.main;

public class Main {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1, j = 1, k = 0; i < 5; i++) {
			if ((i % 2) == 0)
				continue;
			k += i * j++;
			System.out.println(k);
		}
		System.out.println(k);
	}
}
