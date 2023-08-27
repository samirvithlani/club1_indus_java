package com.oops.constructor;

public class Price {

	int x;

	public Price(int p) {

		System.out.println("param constructor...");
		x = p;
	}

	public static void main(String[] args) {

		
		Price p = new Price(10);
		System.out.println(p.x);
		Price p1 = new Price(20);
		System.out.println(p1.x);
	}
}
