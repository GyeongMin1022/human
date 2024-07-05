package quiz;

public class StudentExam {

	public static void main(String[] args) {

//		Student s1 = new Student("최민수");
//		s1.hasGlasses = true;
//		
//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.hasGlasses);
//		
//		Student s2 = new Student("박경민",20);
//		System.out.println(s2.name);
//		
//		s2.name = "박춘보";
//		s2.age = 50;
//		System.out.println(s2.name);
//		System.out.println(s2.age);
//		System.out.println(s1.name);
//		
//		System.out.println(s1);
//		int intel = s1.study("java 클래스");
//		System.out.println("공부를 헀더니 지식이 : "+intel);
//		System.out.println(s1);
//		
//		System.out.println("밥을 먹었더니 공복감이 : "+s1.eat("옹심이칼국수"));
//		System.out.println(s1);
//		
//		s1.sleep(5);
//		System.out.println("현재 스트레스 : " + s1.game("블루아카이브",2));
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		view(s1);
		
		
		Academy 천안 = new  Academy("천안");
		Academy 수원 = new  Academy("수원");
		Student s1 = new Student("최민수",20,"천안");
		Student s2 = new Student("최민수1",20,"수원");
		Student s3 = new Student("최민수2",20,"천안");
		천안.join(s1);
		수원.join(s2);
		천안.join(s3);

		
		천안.viewList();
		수원.viewList();
		
		
	}

//	static void view(Student s) {
//		int stress = s.study("블루아카이브",10);
//		System.out.println(stress);
//	}

}
