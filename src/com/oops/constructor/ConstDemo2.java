package com.oops.constructor;


class ParentConst{
	
	
	public ParentConst() {
		
		System.out.println("default const of parent class");
	}
	
	public ParentConst(int x) {
		System.out.println("param of parent " +x);
	}
	
}

public class ConstDemo2 extends ParentConst{
	
	public ConstDemo2() {
		//System.out.println(",,,");
		super(100);
		System.out.println("child class const..");
	}

	public static void main(String[] args) {
		
		ConstDemo2 c = new ConstDemo2();
		
	}
}
