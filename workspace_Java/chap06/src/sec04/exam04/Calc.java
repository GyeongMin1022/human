package sec04.exam04;

public class Calc {
	int plus(int x, int y){
		System.out.println(x+y);
		return x+y;
	}
	double plus(double x, double y){
		System.out.println(x+y);
		return x+y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(40,20);
		println("실행결과 : " + result);
	}
	void println(String massage) {
		System.out.println(massage);
	}
	
}
