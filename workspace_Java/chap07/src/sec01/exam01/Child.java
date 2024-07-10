package sec01.exam01;

public class Child extends Parent{
	
	// 부모의 필드를 가리는 현상
	
	String name = "Child의 name";
	public Child(){
		System.out.println("Child의 기본생성자");
	}
	// 부모의 name을 변경하는 메소드

	// 전달인자가 필드를 가리는 현상
	void setName(String name) {
		this.name = name;
	}
}
