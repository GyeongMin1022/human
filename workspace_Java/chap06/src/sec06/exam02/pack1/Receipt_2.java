package sec06.exam02.pack1;

//import sec06.exam02.pack2.Receipt_1;
import sec06.exam02.pack2.*; // 해당 폴더에 있는 클래스만
							  // 단 하위패키지의 클래스는 제외

public class Receipt_2 {

	Receipt_2() {
		
		// 다른 클래스를 찾을떄
		// 1. 내 패키지에 있는가
		// 2. java.lang 패키지에 있는가 // 자바 실행시 자동으로 임포트
		// 3. import한 곳에 있는가?
		
		// 내 패키지에 있어서 *로 로딩해도 내껄 찾아갑니다
		// 명확하게 임포트 해주는 경우 pack2의 것도 사용가능
		Receipt_1 r1 = new Receipt_1();
		Receipt_3 r3 = new Receipt_3();
		
		// pack2의 1번을 사용하고 싶다면
		// 다른 패키지의 클래스를 가져오는 두번째 방법
		// 두번쨰 방법 : 패키지 정보와 클래스 정보를 한번에 쓰기
		// 귀찮아서 import 사용한다
		// 부득이한 경우 사용할 수 있다는걸 알아두기
//		sec06.exam02.pack2.Receipt_1 r1_1 = new sec06.exam02.pack2.Receipt_1();
	}
}
