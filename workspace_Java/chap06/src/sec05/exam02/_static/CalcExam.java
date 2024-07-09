package sec05.exam02._static;

public class CalcExam {

	public static void main(String[] args) {
		
		// 자바가 즉 java.exe가 특정 클래스를 실행 할 때
		// 예를 들어 CalcExam클래스를 실행 할 때
		// CalcExam.main(스트링배열)을 실행한다
		// new CalcExam()하지 않는다.
		
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		c1.color = "red";
		c2.color = "blue";
		System.out.println(c1.pi);
		System.out.println(Calc.pi);
		
//		if (c1.test().equals(Constant.LOGIN_SUCCESS){
//			
//		}
		
		c1.pi = 3;
		System.out.println(c1.pi);
		System.out.println(c2.pi);
		
		Calc.test();
	}

}
