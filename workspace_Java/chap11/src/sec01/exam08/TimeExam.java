package sec01.exam08;

import java.lang.String;

public class TimeExam {

	public static void main(String[] args) {

		// timestamp
		// unixtime
		long now = System.currentTimeMillis();
		System.out.println(now);

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis() - now);
	}

}
