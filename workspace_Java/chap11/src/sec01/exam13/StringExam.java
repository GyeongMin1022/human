package sec01.exam13;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "영일이삼사오육칠팔구";
		char c = s1.charAt(3);
		System.out.println("c : " + c);
		int i = s1.length();
		System.out.println("길이 : " + i);

		int i2 = s1.indexOf("이");
		System.out.println("i2 : " + i2);
		// 왼쪽에서 부터 첫번쨰 일치하는 것의 인덱스를 돌려줌
		// 정확하게 일치하는게 없으면 -1
		System.out.println("없는것 : " + s1.indexOf("아"));
		i2 = s1.indexOf("사오");
		System.out.println("i2 : " + i2);

		String blog = "blog.naver.com";
		String cafe = "cafe.naver.com";

		if (blog.indexOf("blog") != -1) {
			System.out.println("블로그 주소");
		} else {
			System.out.println("블로그 주소 아님");
		}

		if (cafe.indexOf("blog") != -1) {
			System.out.println("블로그 주소");
		} else {
			System.out.println("블로그 주소 아님");
		}

		// 이메일 점검
		// @와 .이 없으면 이메일 주소 형식이 아님을 판단
		String email = "todair@naver.com";
		if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
			System.out.println("이메일 주소를 입력받았습니다");
		} else {
			System.out.println("정확한 이메일 주소를 적어주세요");
		}

		// indexOf 구현
		char c3 = 'd';
		boolean flag = false;
		for (int i3 = 0; i3 < email.length(); i3++) {
			char c2 = email.charAt(i3);
			if (c2 == c3) {
				flag = true;
				System.out.println(i3);
				break;
			}
		}
		if (!flag) {
			System.out.println(-1);
		}

		// 첫번째 전달인자를 두번째 전달인자로 "모두" 바꿔줌
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		String s3 = "123123123";
		System.out.println(s3.replace("12", "다른글씨"));

		// 첫번째 인덱스부터 두번째 인덱스 바로 전까지 추출
		String s4 = s1.substring(1, 4);
		System.out.println("s4 : " + s4);

		String ssn = "213456-3123694";
		String s5 = ssn.substring(7, 8);
		if (s5.equals("1") || s5.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		// 전달인자가 하나인 경우 끝까지
		System.out.println(ssn.substring(7));

//		java.lang.StringIndexOutOfBoundsException 에러
//		System.out.println(ssn.substring(100));

		String oldStr = "         글씨   중간띄어쓰기        ";
		System.out.println("[" + oldStr.trim() + "]");

	}

}
