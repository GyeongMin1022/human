package sec03.exam02._abstract;

public class AnimalExam {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Animal a= dog;
		a.sound();
	}

}
