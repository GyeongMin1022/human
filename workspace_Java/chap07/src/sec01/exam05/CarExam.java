package sec01.exam05;

public class CarExam {

	public static void main(String[] args) {
		Bus minibus = new Bus("관광버스");
		Sedan avante = new Sedan("아반떼");
		Truck truck = new Truck("포터");

		truck.drive();
		truck.setSpeedDown(150);
		
		minibus.drive();
		minibus.setSpeedUp(30);
		minibus.setSpeedUp(50);
		minibus.setSpeedDown(50);
		minibus.stop();

		avante.drive();
		avante.setSpeedDown(20);
		avante.modeChange();
		avante.stop();
	}

}
