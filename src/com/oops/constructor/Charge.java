package com.oops.constructor;

//java -->
//default 
//param --> 0 param constr...
//compiler -->
//use of constructor... >> to intilize instance variable of class and load class to mmeory...
public class Charge {

	int x;

	public Charge() {

		System.out.println("default constructor...");
		x = 100;
	}

	public static void main(String[] args) {

		
		Charge c = new Charge(); //default constructor...
	}
}
