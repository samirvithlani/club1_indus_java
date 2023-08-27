package com.oops.constructor;

public class ThidDemo {

	int x=20;
	public ThidDemo(int x) {
		
		System.out.println(x);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		
		
		ThidDemo t  =new ThidDemo(100);
		
	}
}
