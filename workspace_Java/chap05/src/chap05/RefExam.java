package chap05;

public class RefExam {

	public static void main(String[] args) {

		int a;
//		기본타입에 아무것도 넣지 않았을때 에러 발생
//		System.out.println(a);
//		int b = a;

		// =을 기준으로 오른쪽 먼저 실행됨
		// "최민수"가 힙heap 영역에 비어있는 번지에 들어간다
		// 스택(stack) 영역의 c에 그 번지가 기록된다
		String c = "박경민";

		System.out.println("c : " + c);
		System.out.println("c == null : " + c == null);
		System.out.println("c != null : " + c != null);

		System.out.println();

		c = null; // 주소값을 비워서 연결 끊기

		System.out.println("c : " + c);
		System.out.println("c == null : " + c == null);
		System.out.println("c != null : " + c != null);

		System.out.println();
		// 기본 타입과 마찬가지로
		// 값을 할당하지 않으면 사용할 수 없다
		String d;
//		System.out.println(d);
		d = "박경민";
		c = "박경민";
		c = new String("박경민");

		// c가 가지고 있는 주소와 d의 주소값이 다르다
		System.out.println("c == d : " + c == d); // 결과 : false
		System.out.println("c.equals(d) : " + c.equals(d)); // 결과 : true
		System.out.println();
		
		c = null;
//		System.out.println("c.equals(d) : " + c.equals(d));
		String e = c+ "abc";
		System.out.println(c + "abc");
		System.out.println(e);

	}

}
