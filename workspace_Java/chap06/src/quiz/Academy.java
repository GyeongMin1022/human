package quiz;

import java.util.*;

public class Academy {

	List<Student> student = new ArrayList<Student>();

	String name;

	Academy(String s) {
		name = s;
	}

	void join(Student s) {
		student.add(s);
	}

	void viewList() {
		System.out.println("학원명 : " + name);
		for (int i = 0; i < student.size(); i++)
			System.out.println(student.get(i).name);
	}

}
