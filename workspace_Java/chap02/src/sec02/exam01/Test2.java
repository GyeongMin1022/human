package sec02.exam01;

public class Test2 {

	public static void main(String[] args) {
		String left = "수박";
		String right = "멜론";
		String temp = left;
		
		System.out.println(left); // 결과 수박
		System.out.println(right);// 결과 멜론

		// swap
		left = right;
		right = temp;

		System.out.println(left); // 결과 멜론
		System.out.println(right);// 결과 수박

	}

}
