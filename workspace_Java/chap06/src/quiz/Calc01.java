package quiz;

public class Calc01 {
// 계산기 만들기
//	+ - * / %
// 1. 두 수를 받아 연산 결과를 돌려줌
// 2. 첫번쨰 숫자 , 두번째 글씨, 세번째 숫자
// >> 3 , "+" , 5
// 알아서 두번째 글씨에 해당하는 연산결과를 돌려줌

// tv 만들기
// 전원
// 볼륨 up down 0~10
// 볼륨의 범위를 벗어나지 못하게 해주세요
// 채널 up down 직접입력
	
	// 멜론 노래 관리 DB
	// class song
	// 제목 가수명 장르 가사 곡길이
	// 각각의 값을 지정하는 것(제목바꾸기)
	// 모든 정보 표시
	
	//song exam
	// 3곡 이상의 노래를 등록해서 관리
	
	//

	int result;

	int plus(int a, int b) {
		result = a + b;
		return result;
	}

	int minus(int a, int b) {
		result = a - b;
		return result;
	}

	int 곱하기(int a, int b) {
		result = a * b;
		return result;
	}

	double 나누기(int a, int b) {
		return (double) a / b;
	}

	int 나머지(int a, int b) {
		return a % b;
	}
	void 계산(int a, String b, int c) {
		if(b=="+") {
			System.out.println(plus(a,c));
		} else if(b.equals("-")) {
			System.out.println(minus(a,c));
		}
		else if(b.equals("*")) {
			System.out.println(곱하기(a,c));
		}else if(b.equals("/")) {
			System.out.println(나누기(a,c));
		}else if(b.equals("%")) {
			System.out.println(나머지(a,c));
		} else {
			System.out.println("잘못된 연산자를 입력하셨습니다");
		}
	}

}
