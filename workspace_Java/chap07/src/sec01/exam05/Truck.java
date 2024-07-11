package sec01.exam05;

public class Truck extends Car {

	Truck(String n) {
		super.name = n;
		super.speed = 100;

	}

	void drive() {
		System.out.println(super.name+"이(가)"+speed + " 의 속도로 주행합니다");
	}

	void setSpeedUp(int a) {
		speed += a;
		drive();

	}

	void setSpeedDown(int a) {
		speed -= a;
		drive();

	}
}
