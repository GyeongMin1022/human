package sec04.exam04;

public class Fan {
	// 전원 상태를 저장할 필요가 있다 (boolean)
	boolean power = false;
	int wp = 0;

	// 전원켜기
	void powerOn() {
		System.out.println("전원을 켰습니다");
		power = true;
	}

	// 전원 끄기
	void powerOff() {
		System.out.println("전원을 껐습니다");
		power = false;
	}

	// 약풍 기능
	void weak() {
		if (power = true) {
			System.out.println("약풍을 틀었습니다");
			wp = 1;
		} else {
			System.out.println("전원을 먼저 켜주세요");
		}
	}

	// 강풍 기능
	void strong() {
		if (power = true) {
			System.out.println("강풍을 틀었습니다");
			wp = 2;
		} else {
			System.out.println("전원을 먼저 켜주세요");
		}
	}
}
