package sec01.exam05;

public class Sedan extends Car {

	boolean mode = false;

	Sedan(String n) {
		super.name = n;
		super.speed = 100;
	}

	@Override
	void drive() {
		if (mode == true) {
			System.out.println(super.name + "이(가)" + (double) speed * 1.2 + " 의 속도로 주행합니다");
		} else {
			super.drive();
		}

	}

	void setSpeedUp(int a) {
		speed += a;
		drive();

	}

	void setSpeedDown(int a) {
		speed -= a;
		drive();

	}

	void modeChange() {
		if (mode == true) {
			mode = false;
			System.out.println("일반모드로 전환합니다");
			drive();
		} else {
			mode = true;
			System.out.println("스포츠모드로 전환합니다");
			drive();
		}
	}

}
