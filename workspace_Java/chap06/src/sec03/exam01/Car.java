package sec03.exam01;

public class Car {
	String name;
	String color;
	int cc;
	// 생성자 : new 할 때 무조건 실행되는 메소드
	// return을 쓰지 않음 : 무조건 생성된 주소를 돌려주기 때문
	
	// 만약에 생성자를 적지 않으면
	// 기본으로 생성자가 자동으로 만들어집니다.
	// 생성자는 java에게는 중요해서 무조건 있어야 함.
	
	// 내가 생성자를 적은 경우
	// 기본 생성자는 만들어지지 않음
	
	// 생성자 사용 이유 : 
	// 1. 귀찮으니깐 무조건 실행하게 만듬
	// 2. 생성을 위한 필수값 관리 - 필수값이 없으면 생성을 막음
//	Car() {
//		System.out.println("생성자 실행");
//		name = "자동차"; 필드가 먼저 선언되고 생성자 실행
//		System.out.println(name);
//		test();
//	}
	Car(){
	System.out.println("생성자 실행");
	name = "자동차";
	System.out.println(name);
	test();
	color = "회색";
	cc = 1000;

	}
	Car(String color2, int cc2){
//		System.out.println("color = " + color2);
//		System.out.println("cc = " + cc2);
		color = color2;
		cc = cc2;
		
	}
	
	void test() {
		System.out.println("테스트");
	}
	
	void print() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("color = " + color);
		System.out.println("cc = " + cc);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-");
	}
}
