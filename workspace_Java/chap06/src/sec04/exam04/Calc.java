package sec04.exam04;

public class Calc {
	int plus(int x, int y){
		return x+y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 : " + result);
	}
	void println(String massage) {
		System.out.println(massage);
	}
	
}