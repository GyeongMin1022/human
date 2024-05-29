package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {
//		int count = 0;
//		while(true) {
//			int num = (int)(Math.random()*6)+1;
//			
//			System.out.println(num);
//			count++;
//			if(num==6) {
//				break; // 가장 가까운 반복문을 종료
//			}
//		}
//		System.out.println("프로그램 종료\n" + count + "회 던졌습니다");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			if (i == 7)
				break;
			System.out.println("한턴 종료");
		}
		System.out.println("for문 종료");

		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);

			for (int j = 0; j < 3; j++) {

				if (j >= 1)
					break; // j에 대한 for문만 종료한다
				System.out.println("j = " + j);
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {continue;} // 이후 실행문은 무시
			System.out.println("짝수 ? " + i);
		}
	}

}
