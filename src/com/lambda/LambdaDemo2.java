package com.lambda;

interface Cloud {

	//public abstract int rain();
	int rain();
}

public class LambdaDemo2 {

	public static void main(String[] args) {

		
		Cloud c = ()->{
			System.out.println("rain method called...");
			return 10;
		};
		int x = c.rain();
		System.out.println(x);
		
	}
}
