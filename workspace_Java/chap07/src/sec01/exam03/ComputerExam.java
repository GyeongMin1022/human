package sec01.exam03;

public class ComputerExam {

	public static void main(String[] args) {
		System.out.println("Math.PI : " + Math.PI);
		double area = 0;
		
//		Calc calc = new Calc();
//		area = calc.areaCircle(10);
//		System.out.println(area);
		String str = "1234";
	
		Computer c = new Computer();
		area = c.areaCircle(10);
		System.out.println(area);
	}

}
