package helloworld.main;

import java.util.Scanner;

class C {
	private int a;

	public void set(int a) {
		this.a = a;
	}

	public void add(int d) {
		a += d;
	}

	public void print() {
		System.out.println(a);
	}
}

public class Main {
	public static void main(String[] args) {
		C p = new C();
		C q;
		p.set(10);
		q = p;
		p.add(30);
		p.print();

	}
}