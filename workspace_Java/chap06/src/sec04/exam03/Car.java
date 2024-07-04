package sec04.exam03;

public class Car {

	
	//name의 값을 ㅕㅂㄴ경
	// name의 길이가 0인 경우 변경하지 않음
	// 전달인자 String
	// 리턴타입 없음
	
	int gas = 5;
	// 필드
	// 클래스 생성과 함께 생성되고
	// 클래스 소멸 시 까지 생존
	
	//메소드에서 변경하는 경우
	// 다음번 실행까지 저장해둠
	// 그래서 계속 초기화 해야하는 상황이 있을 수 있다.
	
	// gas의 값이 0 이면 false
	// 그렇지 않으면 true
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("Gas가 없습니다");
			return false;
		} else {
			System.out.println("Gas가 있습니다");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("주행중 .. 잔량 : " + gas);
				gas--;
			} else {
				System.out.println("주행종료 .. 잔량 : " + gas);
				return;
			}
		}
		
	}
	String name;
	void setName(String nick) {
		System.out.println(name.length());
		if(nick.length() != 0) {
			name = nick;
		} else {
			System.out.println("이름은 필수");
		}
	}
	
	
}
