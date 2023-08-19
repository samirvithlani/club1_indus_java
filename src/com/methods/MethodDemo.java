package com.methods;
//com.methods.MethodDemo


public class MethodDemo {
	
	void test() {
		
		System.out.println("non static wo args wo rtype...");
	}
	void test1() {
		
		test();
		demo1(190, 10);
	}
	
	void demo1(int a,int b) {
		
		System.out.println("non static");
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
	}

	public static void main(String[] args) {
		
		MethodDemo m1 = new MethodDemo();
		m1.test();
		m1.demo1(100, 200);
	}
}
