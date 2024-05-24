package sec02.exam01;

import java.util.Scanner;

public class TypeCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2 + 2 * 2;
		long b = (long) a; // int인 a를 long타입으로 바꿔라
							// long이 long타입에 들어가는건 문제가 안된다
							//
		long c = a; // 작은것에서 큰것으로 바뀔땐 손실이 없으므로
					// 형변환을 생략 할 수 있다.
					// 묵시적, 암시적, 암묵적으로 형변환
		System.out.println("c = " + c);

		a = (int) c; // 큰거에서 작은거롤 바뀔때는 손실이 있을 수 있다.
						// 형 변환을 생략할 수 없다.
						// 명시적, 강제 형변환
		long d = 3000000000L;
		a = (int) d;
		System.out.println("a = " + a);

		double d2 = 3.14;
		int i = (int) d2;
		System.out.println("i = " + i);

//		int result = 43;
		double result = 43;
		int count = 10;
		System.out.println("(double)count = " + (double) count);
		System.out.println(result / (double) count);
		System.out.println(result / count);
		// double과 int연산 할 때 int가 double로 자동 형변환되서 연산됨
		int i2 = 2100000000;
		int i3 = i2 * 2;// int끼리 연산해서 연산자체는 문제가 X
		System.out.println(i3); // 결과 : -94967296(넘침)

		System.out.println(3 + " 문자");
		System.out.println(3 + 4 + " 문자");
		System.out.println("" + 1 + 300 + "px");
		System.out.println("" + (1 + 300) + "px");
		
		System.out.println("-------------------------");
		System.out.print("첫번째줄");
		System.out.print("두번째줄");
		System.out.print("i3의 값은 : ");
		System.out.print(i3 + "\n");
		System.out.println("-------------------------");
		System.out.printf("i3의 값은 : %d\n", i3);
		System.out.printf("i2의 값은 : " + i2 + " i2의 값은 :" + i3 + "\n");
		System.out.printf("i2의 값은 : %d i3의 값은 : %d \n", i2, i3);
		
		System.out.println("-------------------------");
		
		System.out.println("아무거나 입력하세요 ...");
		Scanner scan = new Scanner(System.in); // 입력 받으려고 준비
		String input = scan.nextLine();
		System.out.println("input : " + input);
	}

}
