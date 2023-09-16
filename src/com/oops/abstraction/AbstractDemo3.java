package com.oops.abstraction;


abstract class A{
	
	public abstract void test();
}

abstract class B extends A{
	
	public void test() {}
}

abstract class C extends B{
	
}
class D extends C{
	
	
}



public class AbstractDemo3 extends D{

	public static void main(String[] args) {
		
		
	}
}
