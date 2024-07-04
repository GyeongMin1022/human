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
		
		Calc calc3 = new Calc();
		calc3.powerOn();
//		calc3.isOn = true;
		
		calc2.powerOn();
		
		int result = calc3.plus(3, 8);
		System.out.println("plus 결과 = "+result);
		
		double result1 = calc3.divide(5, 0);
		if(result1 != 0) {
		System.out.println("divide 결과 = "+result1);
		} else {
			System.out.println("divide 결과 = "+(int)result1);
		}
		
		int[] a = {2,7};
		System.out.println(calc3.plus2(a));
		
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다");
	}

}
