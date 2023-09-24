package com.lambda;

interface Calc {

	int sum(int a, int b);
}

public class LambdaDemo3 {

	public static void main(String[] args) {

		Calc c = (a, b) -> {
			System.out.println("calc method called...");
			return a + b;
		};
		
		int ans = c.sum(100, 10);
		System.out.println("sum = "+ans);
		
	}
}
