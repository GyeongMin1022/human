package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1씩 증가하는 걸 5번
		int sum = 0;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println(sum);
		
		// 1+ 2+ 3+ 4+ 5
		sum = 0;
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		System.out.println(sum);
		
		//1, 2, 3에 해당하는 걸 변수에 넣어보자
		sum = 0;
		int i = 0;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		System.out.println(sum);
		
	}

}
