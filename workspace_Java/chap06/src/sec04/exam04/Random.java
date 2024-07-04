package sec04.exam04;

public class Random {
	// 임의의 수 0~9에서 하나 결정
	int num = (int)(Math.random() * 10);
	int count= 0;
	boolean ok = false;
	// 사회자 양반 여기 정답(3)	>> up, down (시도횟수 : n)
	// 정답 (시도횟수 : n)
	void answer(int n) {
		count++;
		if(n == num) {
			System.out.println("정답입니다. 시도횟수 : "+count);
			ok = true;
		} else if(n>num){
			System.out.println("Down. 시도횟수 : "+count);
		}
		else if(n<num){
			System.out.println("up. 시도횟수 : "+count);
		}
		
	}
	
	
}
