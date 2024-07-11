package sec01.exam04;

public class Food {

	String name;
	int price;
	String recipe;
	String type;

	Food(){}
	Food(String name, int price, String recipe, String type) {
		this.name = name;
		this.price = price;
		this.recipe = recipe;
		this.type = type;
		System.out.println("Food 생성자 실행 완료");
	}

	int eat() {
		System.out.println(this.name + "먹는다");
		return (int) (Math.random() * 5) + 1;
	}

	int order(int money) {
		int change = 0;
		if(money < this.price) {
			System.out.println(this.name + "주문은 금액 부족으로 주문 취소합니다");
		} else {
			System.out.println(this.name + "주문한다");
			change = money - this.price;
		}
		return change;
	}

	void cook() {

	}

	/*
	 * 이름 name 가격 price 주재료 recipe 종류 type
	 */

	/*
	 * 먹는다 eat() 주문한다 order() 요리한다 cook()
	 */
}
