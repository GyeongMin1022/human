package quiz;

public class LoginExam {

	public static void main(String[] args) {
		
		Login l = new Login("admin","asdasd");
		// 로그인 실패
		l.LoginGo("1", "2");
		// 로그인 성공
		l.LoginGo("admin","asdasd");
	}

}
