package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {

		Avante avante = new Avante();
		
		Driver driver = new Driver();
		driver.run(avante);
		
		Spark spakr = new Spark();
		driver.run(spakr);
		
	}

}
