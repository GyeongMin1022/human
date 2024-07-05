package quiz;

public class SongExam {

	public static void main(String[] args) {

		Song 첫번째곡 = new Song();
		Song 두번째곡 = new Song();
		Song 세번째곡 = new Song();
		
		첫번째곡.set가사("가사가 없다");
		두번째곡.setName("바꾼이름");
		세번째곡.set곡길이(5000);
		
		첫번째곡.전체출력();
		두번째곡.전체출력();
		세번째곡.전체출력();
	}

}
