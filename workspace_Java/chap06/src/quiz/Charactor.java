package quiz;

public class Charactor {

	int hp = 100;
	int defense = (int)(Math.random()*5);
	int atk = 0;
	void attack(int a){
		if(a < defense) {
			hp -= 1;
			System.out.println(-1+"의 피해를 입혔습니다");
		} else {
			hp-= a;
			System.out.println(a-defense+"의 피해를 입혔습니다");
		}
	}
	
	void heal(int a) {
		hp += a;
		if(hp>100) hp =100;
		System.out.println(a+"만큼 힝회복했습니다");
	}
}
