package com.array;

public class ArrayVargs {

	public void testData(int a, int b) {

		System.out.println(a + " - " + b);
	}

	public void testArray(int p, int... a) {

		System.out.println("p -> " + p);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		ArrayVargs av = new ArrayVargs();
		av.testData(10, 20);
		av.testArray(10, 20, 40, 50);

	}
}
