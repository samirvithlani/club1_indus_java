package com.oops.polymorephisam.overriding;

class Chandryan2 {

	// access modifiers return type name param
	int setRover() {

		System.out.println("set rover parent");
		return 1;
	}

	public  void setOrbit() {

		System.out.println("set orbit of parent chandryan");
	}

}

public class Chandrayan extends Chandryan2 {

//	void setRover() {
//
//		System.out.println("set rover parent");
//		//return 1;
//	}

	public void setOrbit() {

		System.out.println("set orbit of parent chandryan-2");
	}

	public static void main(String[] args) {

		Chandrayan c = new Chandrayan();
		c.setOrbit();
	}
}
