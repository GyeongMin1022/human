package Quiz;

public class Eng extends Dictionary {
	String[] eng = new String[] { "Love", "Friendship" };

	void translate(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				System.out.println(eng[i]);
			}
		}
	}
}
