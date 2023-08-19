package com.methods;

public class MehtodDemo2 {

	
	static void prints() {
		System.out.println("prints method called...");
	}
	static int sum(int a,int b,int c) {
		
		return a + b+ c;
	}
	void test() {
		prints();
	}
	public static void main(String[] args) {
	
		prints();
		System.out.println(sum(10, 20, 30));
		int x = sum(100,200, 300);
		System.out.println(x);
		
		MehtodDemo2.prints();
	}
}
