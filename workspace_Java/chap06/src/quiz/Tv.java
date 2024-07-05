package quiz;

public class Tv {
// 전원
// 볼륨up down 0~10 > 범위를 벗어나지 못하게
// 채널 up down 직접입력 300
// 정보보기
	boolean po;
	int volume;
	int ch;

	Tv() {
		po = false;
		volume = 0;
		ch = 0;
	}

	void power() {
		if (po == true) {
			System.out.println("전원을 종료합니다");
			po = false;
		} else {
			System.out.println("전원을 켭니다");
			po = true;
		}
	}

	void volumeUp() {
		if (po == false) {
			System.out.println("전원을 먼저 켜주세요");
		} else if (po == true && volume == 0) {
			System.out.println("현재 볼륨 : " + volume);
		} else if (po == true && volume == 10) {
			System.out.println("현재 볼륨 : " + volume);
		} else {
			volume++;
			System.out.println("현재 볼륨 : " + volume);
		}
	}

	void volumeDown() {
		if (po == false) {
			System.out.println("전원을 먼저 켜주세요");
		} else if (po == true && volume == 0) {
			System.out.println("현재 볼륨 : " + volume);
		} else if (po == true && volume == 10) {
			System.out.println("현재 볼륨 : " + volume);
		} else {
			volume--;
			System.out.println("현재 볼륨 : " + volume);
		}
	}

	void chup() {
		if (po == false) {
			System.out.println("전원을 먼저 켜주세요");
		} else if (po == true && ch == 300) {
			ch = 0;
			System.out.println("현재 채널 : " + ch);
		} else {
			ch++;
			System.out.println("현재 채널 : " + ch);
		}
	}

	void chdown() {
		if (po == false) {
			System.out.println("전원을 먼저 켜주세요");
		} else if (po == true && ch == 0) {
			ch = 300;
			System.out.println("현재 채널 : " + ch);
		} else {
			ch--;
			System.out.println("현재 채널 : " + ch);
		}
	}

	void chanel(int a) {
		ch =a;
		System.out.println("현재 채널 : " + ch);
	}
	void now() {
		System.out.println("전원 "+po +" 볼륨 "+ volume +" 채널 "+ ch);
	}

}
