package com.oops.abstraction;

abstract class Parent1 {

	public abstract void demo1();
	public abstract void demo();
	public void a1() {}
}

abstract class Parent2 extends Parent1 {

	public abstract void demo();

	public abstract void props();
	
	public void a() {}

}

public class AbstractDemo2 extends Parent2 {

	public static void main(String[] args) {

	}

	public void props() {
	}


	public void demo() {
		// TODO Auto-generated method stub

	}

	public void demo1() {
		// TODO Auto-generated method stub
		
	}
}
