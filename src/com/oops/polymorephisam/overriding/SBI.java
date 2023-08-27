package com.oops.polymorephisam.overriding;

class Bank {

	public float intRate() {
		System.out.println("bank class intRate called....");
		return 12.2f;
	}
	
	public void test() {
		
		System.out.println("test..");
	}

}

public class SBI extends Bank {

	public float intRate() {
		System.out.println("sbi class intRate called....");
		return 14.0f;
	}

	public static void main(String[] args) {
		
		//referance of parent class and child class object / memory...
		
		Bank b = new SBI();
		b.intRate();
		b.test();

	}
}
