package sec02.exam01;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번내가 운전하는 자동차가 있다/없다
		boolean car = true;
		// 2번 우리집에 있는 스마트폰의 갯수
		int phone = 6;
		// 3번 내이름
		String name = "박경민";
		// 4번 1평=3.3 5평은?
		double t4 = 3.3;

		// 1번
		if (car == true) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
		// 2번
		System.out.println(phone);
		// 3번
		System.out.println(name);
		// 4번
		System.out.println(t4 * 5);

	}

}
