package chap05;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {

		// 기본 타입에는 null을 이용할 수 없음
		// null은 int도 아니고 double도 아니다

		// 배열
		// 한번에 여러 변수를 만드는 방법
		// 같은 타입만 선언 할 수 있음
		// 생성된 여러 변수들은 index로 관리할 수 있다

		// 선언 방법
		// int 로 구성된 배열이다
		int[] score;
//		int score[];

		score = null;

		int[] score3 = null;
		int score0 = 90;
		int score1 = 60;
		int score2 = 70;

		// 배열을 생성 할 때 크기를 알려줘야 합니다.
		// 첫번째 대괄호 [] : int[]는 배열인데 int로 이루어진 배열이다
		// 두번째 대괄호 [3] : 즉 한번에 만들 변수의 개수
		// 연달아서 타입의 크기만큼 메모리 할당
		// 첫번째 변수부터 index0으로 시작
		// 세번째 intArray[0] : 만들어진 변수들 중 첫번째 변수를 뜻함
		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
//		intArray[2] = 70;

		System.out.println("intArray[1] : " + intArray[1]);

		// 기본값은 0 또는 false로 초기화 된다
		System.out.println("intArray[2] : " + intArray[2]);
		// ArrayIndexOutOfBoundsException
//		System.out.println("intArray[3] : " + intArray[3]);

		// 배열의 모든 값을 1로 바꾸기
		intArray[0] = 1;
		intArray[1] = 1;
		intArray[2] = 1;
		int a = 1;
		a++;
		intArray[a] = 1;

		for (int i = 0; i < 3; i++) {
			intArray[i] = 1;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println(intArray); // [I@59f95c5d
		System.out.println(intArray.length);

		// 한번 선언된 배열의 크기는 바꿀수 없다

		// 배열을 선언하는 두번째 방법
		// 값을 미리 알고 있을때 쓰는 방법
		int[] intArray2 = new int[] { 10, 20, 30, 40 };
		for (int i = 0; i < intArray2.length; i++) {
			System.out.print(intArray2[i] + " ");
		}
		System.out.println();
		// 선언과 동시에 초기화 할 경우만 가능
		int[] intArray3 = { 100, 200, 300, 400 };
		for (int i = 0; i < intArray3.length; i++) {
			System.out.print(intArray3[i] + " ");
		}
		System.out.println();

		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "박경민" + (i + 1);
			System.out.printf("%s %02d \n", arr[i], i + 1);
		}
		System.out.println();
		// 1~10까지 배열에 넣고
		// 배열의 총 합 출력
		// 배열의 평균값 출력
		int[] score5 = new int[10];
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < score5.length; i++) {
			score5[i] = i + 1;
			sum += score5[i];
		}
		avg = (double) sum / score5.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];

		// 맨뒤의 []는 배열을 뜻함
		// 앞의 []는 배열의 내용물
		// int[]을 변수로 관리하는 배열이 된다는 뜻
		// [4]는 천안의 크기 즉, '천안'으로 관리되는 변수의 갯수
		int[][] 천안 = new int[4][22];

		System.out.println(천안); // [[I@5a01ccaa
		System.out.println(천안[0]); // [I@71c7db30
		System.out.println(천안[0][0]); // 0

		int[][] 수원 = new int[4][22];
		int[][] 서울 = new int[4][22];

		int[][][] 휴먼 = new int[3][4][22];
		System.out.println(3 * 4 * 22);
		System.out.println(휴먼); // [[[I@19bb089b

		System.out.println("휴먼.length : " + 휴먼.length);
		System.out.println("휴먼[0].length : " + 휴먼[0].length);
		System.out.println("휴먼[0][0].length : " + 휴먼[0][0].length);
		System.out.println();

		int[][] 달력 = new int[12][31];
		System.out.println("달력");
		for (int i = 0; i < 달력.length; i++) {
			for (int j = 0; j < 달력[i].length; j++) {
				System.out.printf("%2d월 %2d일 %d\n ", i + 1, j + 1, 달력[i][j]);

			}
			System.out.println();
		}

		ArrayList list = new ArrayList();
		list.add(1);
		list.add("문자");
		list.add(true);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 배열의 length
		System.out.println(list.size());
	}

}
