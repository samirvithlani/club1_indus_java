package com.methods;

public class MethodVar {

	//not compulsary to intilize...
	//non static instrance variable...
	int a =100;
	int x; //default 0
	static int y;
	
	void test() {
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(x); error...
		MethodVar m1 = new MethodVar();
		System.out.println(m1.x);
		System.out.println(y);
		System.out.println(m1.y);
		System.out.println(MethodVar.y);
		//MehtodDemo2.prints();
	}
}
