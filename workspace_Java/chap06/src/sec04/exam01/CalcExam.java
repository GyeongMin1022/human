package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		powerOn(); // 이건 내꺼에요
		powerOn();
		Calc calc = new Calc();
		calc.powerOff();
		System.out.println(calc);
		Calc calc2 = new Calc();
		System.out.println(calc2);
	}
	static void powerOn() {
		System.out.println("전원을 켭니다");
	}

}
