package sec02.exam01;

public class Test1 {

	public static void main(String[] args) {
		int money1 = 7234; // 7234원이 있습니다
		
//		System.out.println("===============hr=================");
//		System.out.println("5000원은 최대 " + (money1/5000) + "장");
//		System.out.println("1000원은 최대 " + (money1/1000) + "장");
//		System.out.println("500원은 최대 " + (money1/500) + "개");
//		System.out.println("100원은 최대 " + (money1/100) + "개");
//		System.out.println("50원은 최대 " + (money1/50) + "개");
//		System.out.println("10원은 최대 " + (money1/10) + "개");
//		System.out.println("1원은 최대 " + (money1/1) + "개");
		
		
		System.out.println("===============hr=================");
		System.out.println("현재금액 " + money1 + "원");
		System.out.println("5000원은 최대 " + (money1/5000) + "장");
		money1 -= money1/5000 *5000;
		System.out.println("1000원은 최대 " + (money1/1000) + "장");
		money1 -= money1/1000 *1000;
		System.out.println("500원은 최대 " + (money1/500) + "개");
		money1 -= money1/500 * 500;
		System.out.println("100원은 최대 " + (money1/100) + "개");
		money1 -= money1/100 * 100;
		System.out.println("50원은 최대 " + (money1/50) + "개");
		money1 -= money1/50 * 50;
		System.out.println("10원은 최대 " + (money1/10) + "개");
		money1 -= money1/10 * 10;
		System.out.println("1원은 최대 " + (money1/1) + "개");
		
		money1 = 28234;
		System.out.println("===============hr=================");
		System.out.println("현재금액 " + money1 + "원");
		System.out.println("5000원은 최대 " + (money1/5000) + "장");
		money1 = money1%5000;
		System.out.println("1000원은 최대 " + (money1/1000) + "장");
		money1 = money1%1000;
		System.out.println("500원은 최대 " + (money1/500) + "개");
		money1 = money1%500;
		System.out.println("100원은 최대 " + (money1/100) + "개");
		money1 = money1%100;
		System.out.println("50원은 최대 " + (money1/50) + "개");
		money1 = money1%50;
		System.out.println("10원은 최대 " + (money1/10) + "개");
		money1 = money1%10;
		System.out.println("1원은 최대 " + (money1/1) + "개");

	}

}
