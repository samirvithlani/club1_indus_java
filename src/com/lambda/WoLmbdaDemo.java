package com.lambda;


interface Calling{
	
	//functional interedace...
	void call();
	
}

public class WoLmbdaDemo implements Calling {

	public static void main(String[] args) {
		
		Calling c = new WoLmbdaDemo(); //polymorphic...
		c.call();
		
	}

	@Override
	public void call() {

		System.out.println("call method called....");
		
	}
}
