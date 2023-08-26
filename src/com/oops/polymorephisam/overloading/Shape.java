package com.oops.polymorephisam.overloading;

public class Shape {

	
	void getArea() {
		
		System.out.println("get area called..");
	}
	void getArea(int h) {
		
		System.out.println("square area called");
		System.out.println(h*h);
	}
	void getArea(float r) {
		
		System.out.println("circle area called.."+ (3.14*(r*r)));
	}
	
	public static void main(String[] args) {
		
		
		Shape s = new Shape();
		s.getArea();
		s.getArea(2.3f);
		s.getArea(12);
	}
}
