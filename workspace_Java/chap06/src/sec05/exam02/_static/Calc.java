package sec05.exam02._static;

public class Calc {
	static double pi = 3.141592;
	String color;
	// 지역변수
	// 해당 블럭에서만 사용가능
	
	// 필드변수
	// new가 된 순간(인스턴스)부터 소멸될 때까지 사용가능
	
	// static(정적변수) == 클래스 변수 == 공용 변수
	// 자바 실행시 사용가능 종료시 사라짐
	Calc() {
		System.out.println(pi);
	}

	// static 에서는
	// static밖에 못쓴다
	// this 못쓴다
	static String test() {
		System.out.println(pi);
//		test2();
		String s ="LC0001"; 
		return s;
	}

	// static이 아닌것은
	// static을 마음대로 사용 할 수 있다.
	void test2() {
		test();
	}

}
