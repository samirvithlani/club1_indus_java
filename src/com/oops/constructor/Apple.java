package com.oops.constructor;


class Samsung{
	
	public Samsung(int amount) {
		
		System.out.println("samsung param "+amount);
	}
}
public class Apple extends Samsung {

	public Apple() {
		
		super(120);
		System.out.println("apple defaulr...");
		// TODO Auto-generated constructor stub
	}
	
	public Apple(int am) {
		
		super(12);
	}

	public static void main(String[] args) {
		
		Apple a = new Apple(12);
		
	}
}
