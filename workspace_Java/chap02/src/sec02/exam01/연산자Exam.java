package sec02.exam01;

public class 연산자Exam {

	public static void main(String[] args) {

		int a = 10;
//		a = 11;
//		a = 10 + 1;
		int b = a + 1;
		a = a + 1; // a = 1 + a;
		a += 1; // a = a + 1;과 같다
		a++; // a += 1;과 같다
		++a;

		a = 10;
		a++;
		System.out.println("a = " + a);

		a = a - 2;
		a -= 2;
		a -= 1;
		a--; // a -= 1;과 같다
		--a;

		a = 10;
		a--;
		System.out.println("a = " + a);
		// 현재 a가 9
		System.out.println("++a = " + ++a); // 출력 10
		// 현재 a가 10
		System.out.println("a++ = " + a++); // 출력 10
		System.out.println("a = " + a);
		// 현재 a가 11
		System.out.println(a++ + ++a);
		// 11 + 13 = 24
		a = 11;
		int result = a;
		a = a + 1; // a다음에 오는 ++
		a = a + 1; // 두번째 a 앞에 오는 ++
		result  = result +a;
		System.out.println(result);
		
		
		boolean c = true;
		System.out.println("c : " + c);
		c = !c;
		System.out.println("!c : " + c);
		
		double d = 7;
		System.out.println(d / 3);  
		System.out.println(d / 0); // Infinity
//		System.out.println((int)d / 0); //error
		
		int f = 10;
		int p = 5;
		System.out.println("몫: " +(f / p));
		System.out.println("나머지 : " +(f % p));
		// 나 돈 만원이 있어요
		// 커피 4500원 짜리 몇잔 살 수있나요
		int money = 10000;
		int coffee = 4500;
		System.out.println(money/coffee + "잔 살 수 있습니다");
		System.out.println(money%coffee + "원 남았습니다");
		
		// 올리브영에서 전품목 15% 행사를 합니다.
		// 1. 꿀 홍차 5000원을 샀을때 얼마를 내야하나요?
		// 2. 꿀홍차와 립스틱 10000을 샀어요 얼마를 내야하나요?
		
		int redtea = 5000;
		int stick = 10000;
		//1번정답
		System.out.println("꿀홍차는" + redtea * 0.85 + "원입니다.");
		//2번정답
		System.out.println("꿀홍차와 립스틱은" + (redtea+stick) * 0.85 + "원입니다.");
		
		// 7234원이 있습니다
		// 5000원 , 1000원, 500원, 100원, 50원, 1원
		// 각각 최대 몇개까지로 표현할 수 있나요?
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
		
		money1 = 7234;
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
		
		System.out.println(3 > 5);
		boolean bool = 3 > 5;
		System.out.println(bool);
		System.out.println(0.1 == 0.1f); //결과 false
		// 같은 타입으로 변경해서 비교하자
		System.out.println((double)0.1f);
		
		System.out.println("3 == 3 : " + (3 == 3));
		System.out.println("3 != 3 : " + (3 != 3));
		
		String str1 = "박경민";
		String str2 = "박경민";
//		System.out.println(str1 == str2);
		// 글씨 비교는 == 사용 금지
		// String 변수나 ""에 .equals( )붙여서 사용 ()안에 글씨와 비교
		System.out.println(		str1.equals(str2)	);
		System.out.println(10 & 3);
		System.out.println(10 | 3);
		
		int i1 = 7;
		int i2 = 15;
		int i3 = 7;
		
		System.out.println("i3이 가장 큰 값인가? "
		+ (i3 >=i1 && i3>=i2));
		boolean i3가크다 = i3> i2;
		System.out.println(i3가크다? "i3크다" : "i3작거나같다");
		
		
	}

}
