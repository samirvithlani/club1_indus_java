package com.oops.abstraction;

//interface is fully abstract class only...
interface Call {

	// public abstract...
	void calling();
	// public abstract void calling();

	public abstract int msg();

	// instacne variable of interface....
	// public final static
	int x = 10;
	public final static int y = 20;

}

public class InterfaceDemo1 implements Call {

	public void calling() {
		System.out.println("calling method called...");
		System.out.println(Call.x);
		// Call.x = 20; // error because it is final variable....
	}

	public static void main(String[] args) {

		// parent class ref and child class object..
		System.out.println(x);

		Call c = new InterfaceDemo1();
		c.calling();
		c.msg();

		// Call c1 = new Call();
	}

	public int msg() {

		System.out.println("msg method called...");
		return 0;
	}

}
