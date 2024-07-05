package quiz;

public class Login {
	String id;
	String pw;
	boolean now = false;
	
	Login(){
		id = "amdin";
		pw = "qwerty";
		System.out.println("아이디가 생성되었습니다");
	}
	Login(String a, String b){
		id = a;
		pw = b;
		System.out.println("아이디가 생성되었습니다"); 
	}
	void LoginGo(String a, String b){
		if(a.equals(id) && b.equals(pw) ) {
			now = true;
			System.out.println("메인페이지");
			System.out.println(now);
		} else {
			now = false;
			System.out.println("로그인 화면으로 돌아감");
			System.out.println(now);
		}
	}
	
}
