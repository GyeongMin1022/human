package sec02.exam01;

public class VarTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
//		b= 128;
		char c = 97;
		
		System.out.println(c); // 소문자a
		c= 97 + 5;
		System.out.println(c); //
		char c1='a'; // 문자 하나만 저장하는 용도 ' '로 감싼다.
		
		long balance = 3000000000L;// 명확하게 long으로 지정 하려면
									// 숫자 뒤에 L 또는 l(소문자L)을 붙여준다.
		String s = "문\t자\n열";
		System.out.println(s);// \t tab공백
		s = "문문\t자";
		System.out.println(s);
		
		float f = 0.1234567890123456789F; 
		System.out.println(f);
		// 소숫점 7자리 까지 정확
		double d = 0.1234567890123456789;
		System.out.println(d);
		// 소숫점 16번째 까지 정확
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}

}
