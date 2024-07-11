package sec01.exam05;

public class Car {

	String name;
	int speed;

	Car() {
		System.out.println("차량 출고가 완료되었습니다");
	}

	void drive() {
		System.out.println(name + "이(가) " + speed + " 의 속도로 주행합니다");
	}

	void setSpeedUp(int a) {
		speed += a;
		drive();

	}

	void setSpeedDown(int a) {

		if (speed <= a) {
			stop();
		} else {

			speed -= a;
			drive();
		}

	}

	void stop() {
		System.out.println("차랑을 정지합니다");
		speed = 0;
	}

}
