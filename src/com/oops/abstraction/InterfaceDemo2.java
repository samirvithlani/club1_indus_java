package com.oops.abstraction;


//class A1{
//	
//}
//class B1{
//	
//	
//}
//
//public class InterfaceDemo2 extends A1,B1{
//
//	public static void main(String[] args) {
//		
//		
//	}
//}
interface A1{
	
	void sum();
}
interface B1{
	
	void sum();
}

public class InterfaceDemo2 implements A1,B1{

	public static void main(String[] args) {
		
		A1 a = new InterfaceDemo2();
		B1 b = new InterfaceDemo2();
		
		a.sum();
		b.sum();
		
	}


	public void sum() {
		
		System.out.println("sum method called...");
		
	}
}
