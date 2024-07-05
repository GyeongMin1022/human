package quiz;

public class Student {

	// 값
	// 이름 나이 주소 성별 전공
	String name;
	int age;
	String adress;
	int gender;
	String major;
	boolean hasGlasses;

	// 행동으로 변하는 수치
	int stress = 0;
	int intel = 0;
	int hp = 100;
	int hungry = 0;

	// 행동
	// 공부 식사 수면 게임

	// 공부
	// 지식이 높아지고
	// 스트레스 높아지고
	// 체력 낮아지고
	// 공복감 높아지고

	// 전달인자 : 공부한 내용 (String)
	// 리턴 : 없음
	int study(String subject) {
		System.out.println(subject + "을(를) 공부했다");
		intel += 5;
		stress += 10;
		hp--;
		hungry++;
		// intel을 리턴하는 코드를 완성 하세요
		return intel;
	}

	// 식사
	// 먹은 음식을 출력하고
	// 체력 조금 올라가고
	// 스트레스 조금 낮아지고
	// 공복감이 많이 낮아지고
	// 전달인자 : String 음식
	// 리런타입 : int 공복감

	int eat(String food) {
		System.out.println(food + "을(를) 먹었습니다");
		hp += 5;
		stress -= 5;
		hungry -= 20;
		return hungry;
	}

	// 수면 메소드 완성
	// 스트레스 d hp u
	void sleep(int a) {
		System.out.println(a + "시간 잤습니다");
		stress -= 20;
		hp += 10;
		hungry -= 10;
		intel += 3;

	}

	int game(String a, int hour) {// 게임명 입력
		System.out.println(a + "을(를) 했다 " + hour + "시간만 하자");

		// 반복문 연습
		// 난이도 1 : 시간당 한번씩 " 한번만 더하자 " 출력
		// 난이도2 : 30분에 한번씩 출력

		// 조건문 연습
		// 2시간 이하면 - 오늘 좀 안됐다 그만하자, 스트레스 +5
		// 4시간 이하면 - 간단하게 한게임 했다, 스트레스 -10
		// 4시간 이상- 오늘 신났다, 스트레스 -20
		if (hour < 0) {
			System.out.println("시간을 다시 입력해주세요");
			return 0;
		} else {
			study(a, 10);
			// 난이도 1 : 시간당 한번씩 " 한번만 더하자 " 출력
			for (int i = 0; i < hour; i++) {
				System.out.println("한번만 더하자");
			}

			// 난이도 2 : 30분에 한번씩 출력
			for (double i = 0.0; i < hour; i += 0.5) {
				System.out.println("30분에 한번만 더하자");
			}

			if (hour >= 2) {
				System.out.println("오늘 좀 안됐다 그만하자  스트레스 +5");
				stress += 5;
			} else if (hour >= 4) {
				System.out.println("간단하게 한게임 했다 스트레스 -10");
				stress -= 10;
			} else {
				System.out.println("간단하게 한게임 했다 스트레스 -20");
				stress -= 20;
			}

			return stress;

		}
	}

	// 게임 메소드 완성
	// 단, 게임하면서 게임 공부도 했다고 치고
	// study 메소드 활용

	// 공부할때랑 게임할때의 스트레스가 다르므로
	// 스트레스를 전달 할 수 있는 study를 오버로딩 한 메소드 만들기
	int study(String subject, int a) {
		System.out.println(subject + "을(를) 공부했다");
		intel += 5;
		stress += a;
		hp--;
		hungry++;
		// intel을 리턴하는 코드를 완성 하세요
		return intel;
	}
	// 생성자
	// 이름과 나이를 입력받지 않으면 생성 못하게 만들기
	// 나이는 중요하지 않아서 이름만 있어도 생성 할 수 있게 만들기
	// 단 두번째 생성자에서는 이름과 나이를 전달받는 생성자 호출하기

	Student(String a, int b, String s) {
		name = a;
		age = b;
	}

//	Student(String a) {
//		this(a, 20);
//	}

	// 내 정보 보기
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", adress=" + adress + ", gender=" + gender + ", major="
				+ major + ", hasGlasses=" + hasGlasses + ", stress=" + stress + ", intel=" + intel + ", hp=" + hp
				+ ", hungry=" + hungry + "]";
	}

}
