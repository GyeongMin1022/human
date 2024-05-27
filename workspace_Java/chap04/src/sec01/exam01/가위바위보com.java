package sec01.exam01;

public class 가위바위보com {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer1 = (int) (Math.random() * 1000) % 3 + 1;
		int computer2 = (int) (Math.random() * 1000) % 3 + 1;
		
		// 컴1 가위일때 컴퓨터1이
		if (computer1 == 1 && computer2 == 1) {
			System.out.println("컴퓨터1 : 가위 \n컴퓨터2 : 가위 ");
			System.out.println("비겼습니다");
		} else if (computer1 == 1 && computer2 == 2) {
			System.out.println("컴퓨터1 : 가위 \n컴퓨터2 : 바위 ");
			System.out.println("컴퓨터2이 이겼습니다.");
		} else if (computer1 == 1 && computer2 == 3) {
			System.out.println("컴퓨터1 : 가위 \n컴퓨터2 : 보 ");
			System.out.println("컴퓨터1이 이겼습니다.");
		} 
		
		// 바위 일때
		else if (computer1 == 2 && computer2 == 1) {
			System.out.println("컴퓨터1 : 바위 \n컴퓨터2 : 가위 ");
			System.out.println("컴퓨터1이 이겼습니다.");
		} else if (computer1 == 2 && computer2 == 2) {
			System.out.println("컴퓨터1 : 바위 \n컴퓨터2 : 바위 ");
			System.out.println("비겼습니다");
		} else if (computer1 == 2 && computer2 == 3) {
			System.out.println("컴퓨터1 : 바위 \n컴퓨터2 : 보 ");
			System.out.println("컴퓨터2이 이겼습니다.");
		} 
		
		//보 일때
		else if (computer1 == 3 && computer2 == 1) {
			System.out.println("컴퓨터1 : 보 \n컴퓨터2 : 가위 ");
			System.out.println("컴퓨터2이 이겼습니다.");
		} else if (computer1 == 3 && computer2 == 2) {
			System.out.println("컴퓨터1 : 보 \n컴퓨터2 : 바위 ");
			System.out.println("컴퓨터1이 이겼습니다.");
		} else {
			System.out.println("컴퓨터1 : 보 \n컴퓨터2 : 보 ");
			System.out.println("비겼습니다");
		}
	}

}
