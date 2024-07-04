package sec04.exam03;

public class CarExam {

	public static void main(String[] args) {

		// Car클래스를 생성해서
		// Car 타입의 myCar 변수에 담는다
		Car c = new Car();
		
		// gas가 남았는지 받아온다
		boolean gasState = c.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다");
			c.run();
			System.out.println(c.name);
			c.setName("몽식이");
			System.out.println(c.name);
		}
		
	}

}
