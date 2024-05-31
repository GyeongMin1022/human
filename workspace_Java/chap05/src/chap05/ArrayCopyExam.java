package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		// 카페 1호점 판매하는 메뉴
		String[] coffee = new String[3];
		coffee[0] = "아아";
		coffee[1] = "라떼";
		coffee[2] = "말차";

		// 카페 2호점에서 1호점과 똑같은 커피를 판매합니다
//		String[] coffee2 = coffee;
		// 얕은복사 call by reference, thin copy, shallow copy
		// stack 영역의 값(주소)만 복사
		// 원본이 바뀌면 당연히 내 값도 바뀐다.

		String[] coffee2 = new String[3];
		coffee2 = coffee;
		for (int i = 0; i < coffee2.length; i++) {

			System.out.println(coffee2[i]);
		}
		System.out.println();

		// 얕은복사로 연결되어 있어서
		// 내껄 바꿔도 원본이 바뀐다
		// 원본의 "주소만" 공유하고 있기 때문에 커피나 커피2는 같은것이다.
		coffee2[1] = "연유라떼";
		System.out.println("커피2의 값을 바꾸고 원본인 커피 출력");
		for (int i = 0; i < coffee.length; i++) {
			System.out.print(coffee[i] + " ");
		}
		System.out.println();
		System.out.println();

		/*
		 * 크기와 내용을 동일하게 가지는 새로운 배열은 만들겠다 깊은복사, deep copy, call by value heap영역에 새로운 주소에
		 * 자리를 마련하고 변수에 주소를 넣는다 그리고 원본의 값들을 복사해서 채워넣는다 그래서 원본과 동일한게 생기지만 전혀 다른 주소를 가지게
		 * 된다 즉, 내 값을 바꿔도 원본이 바뀌지 않음.
		 */
		String[] coffee3 = new String[coffee.length + 1];
		for (int i = 0; i < coffee.length; i++) {
			coffee3[i] = coffee[i];
		}
		System.out.println("커피3 출력");
		coffee3[2] = "아샷추";
		coffee3[3] = "사라다빵"; // 사라다빵 추가
		for (int i = 0; i < coffee3.length; i++) {
			System.out.print(coffee3[i] + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("커피3의 값을 바꾸고 원본인 커피 출력");
		for (int i = 0; i < coffee.length; i++) {
			System.out.print(coffee[i] + " ");
		}
		System.out.println();
		System.out.println();
		// coffee3에 "사라다빵"을 추가하려면?
		// coffee3 = new String[]{"따아", "연유라떼", "아샷추", "사라다빵"}
		// coffee의 크기보다 1개 많은 새로운 배열을 만들고
		// 앞에서 부터 복사 해 놓고 마지막에 새로운 값을 적어보자
		System.out.println("4번째 메뉴를 추가한 결과");
		coffee3[2] = "아샷추";
		coffee3[3] = "사라다빵"; // 사라다빵 추가
		for (int i = 0; i < coffee3.length; i++) {
			System.out.print(coffee3[i] + " ");
		}
		System.out.println();
		System.out.println();

		// 향상된 for문
		System.out.println("향상된 for문");
		for (String s : coffee3) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();

	}

}
