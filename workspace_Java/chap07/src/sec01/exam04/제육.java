package sec01.exam04;

public class 제육 extends Food {

	String spicy;
	제육() {
		System.out.println("제육 생성자 실행");
		this.name = "제육";
		this.price = 8000;

	}

	void setSpicy(String spicy) {
		this.name += spicy;
	}
}
