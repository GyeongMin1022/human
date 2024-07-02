package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {

		Car mycar = new Car();
		Car mycar2 = new Car();
		System.out.println("mycar.model : "+ mycar.model);
		mycar.model = "흑팔라";
		System.out.println("mycar.model : " + mycar.model);
		System.out.println("mycar2.model : "+ mycar2.model);
		System.out.println("mycar.speed : "+ mycar.speed);
		
		mycar.speed = 500;
		System.out.println("mycar.speed : "+ mycar.speed);
	}

}
