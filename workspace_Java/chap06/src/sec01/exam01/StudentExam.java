package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		Student s2 = new Student();
		
		Student s3 = new Student();
		
		s3 = s1;
		
		System.out.println(s3==s1);
		System.out.println(s1==s2);
		
		s2 = null;
		
		
		
	}

}
