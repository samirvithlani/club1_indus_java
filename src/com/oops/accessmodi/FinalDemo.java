package com.oops.accessmodi;

final class MyClass{
	
	
}

public class FinalDemo {
	
	public final int x =10;

	void test() {
		//x = 100; error
		final int p =20;
		System.out.println(x);
	}
	
	final void print() {
		System.out.println("final..");
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
