package sec02.exam05.typeCase;

import java.util.ArrayList;

public class ChildExam {

	public static void main(String[] args) {

		Child child = new Child();
		child.method1("차일드");
		System.out.println("결과 : 차일드의 filed1 : " + child.field1);

		System.out.println("-------------");
		Parent child1 = new Child();
		child.method1("Parent");
		System.out.println("결과 : Parent의 filed1 : " + child.field1);

		Object obj = new Parent();
		ArrayList list = new ArrayList();
//		list.add(p1);
//		list.get(0);
		
	}

}
