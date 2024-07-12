package Cafe;

public class 나 {

	void coffee(커피전문점 shop) {
		if (shop.isDt()) {
			System.out.println("드라이브쓰루 이용한다");
			shop.order("따아");
		} else {
			System.out.println("드라이브쓰루 이용못한다");
			shop.order("따아");
		}
	}
}
