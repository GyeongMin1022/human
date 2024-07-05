package quiz;

public class TvExam {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.power();
		tv.chup();
		tv.chanel(50);
		tv.chup();
		tv.chup();
		tv.chdown();
		tv.power();
		tv.chdown();
		tv.now();
	}

}
