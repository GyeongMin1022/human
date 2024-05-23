package sec02.exam01;

public class VarExam {

	public static void main(String[] args) {

		// 변수 선언 : 자료의 종류와(타입) 한칸띄고 이름
		int score; // 선언부
		score = 90; // 할당

//		int value;
//		value = 30;
		int value = 30; // 선언과 동시에 초기화

		value = 31;

		value = score + value;
//		        90    + 31

		int val;
//		선언을 하지 않은 변수는 사용할 수 없고
//		선언만 하고 값을 넣은 변수는 사용할 수 없다.
//		int val2 = val + 10;

//		같은 이름의 변수를 선언 할 수 없다.
//		int val;

		System.out.println(value);// score + value = 121

		int var1 = 10;
		int var2 = 20;
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var2 : " + var2);
		System.out.println("var2 : " + var2);
		var2 = 30;
		System.out.println("var2 : " + var2);
		System.out.println("var2 : " + var2);

		int x = 10;
		int y = x;
		
		//변수는 자식 혹은 자손 {} 에도 영향을 미친다
		int j=1;
		{
			//int j = 2;
		}
		
		{
			int i=0;
		}
		//위의 i는 사라졌기 때문에 또 i로 선언할 수 있다.
		int i = 1;
		}
	}


