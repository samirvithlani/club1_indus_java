package com.oops.abstraction;

abstract class Try {

	// virtual | abstract

	public abstract void test();

	public void demo() {
		System.out.println("demo method of Try called...");
	}

}

public class AbstractDemo extends Try {

	public static void main(String[] args) {

		AbstractDemo a1 = new AbstractDemo();
		// referance of parent class and object | memory of child class
		Try a = new AbstractDemo();
		a.test();
		a.demo();
		a1.demo();

	}

//	public void demo() {
//		System.out.println("demo method of abstracr demo... called...");
//	}

	public void test() {

		System.out.println("abstract test method called.....");

	}
}
