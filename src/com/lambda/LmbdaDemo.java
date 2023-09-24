package com.lambda;


//lmbda function ---> function without name called...
//preq lmbda function works with only functionl interface...

@FunctionalInterface
interface Prints{
	
	void print();
	
}
public class LmbdaDemo {

	
	public static void main(String[] args) {
		
		
		Prints p = ()->
		{
			System.out.println("print method..");
			
		};
		p.print();
		
	}
}
