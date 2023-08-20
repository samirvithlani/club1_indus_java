package com.oops.inheritance;

//extends
class Mobile{
	
	int x =100; // non static instance varible
	
	void demo() {
		
		System.out.println("mobile class demo method called..");
	}
	
}

class Radio{
	
	
}
public class Phone extends Mobile {
	
	void test() {
		
		System.out.println(x);
		demo();
	}

	public static void main(String[] args) {
		
		//System.out.println(x);
		//demo();
		
	}
}
