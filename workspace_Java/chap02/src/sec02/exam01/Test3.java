package sec02.exam01;

public class Test3 {

	public static void main(String[] args) {
		// 1번문제 int를 double 로 변경해준다
		double var1 = 5;
		double var2 = 2;
		double var3 = var1 / var2;
		double var4 = var3 * var2;
		System.out.println((int) var4); // 5.0이 아닌 5를 출력하고 싶을 때(int)

		int value = 356;
		System.out.println( value / 100 * 100);
		System.out.println(value - (value % 100));

	}

}
