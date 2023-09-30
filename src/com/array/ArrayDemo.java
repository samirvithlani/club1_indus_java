package com.array;

public class ArrayDemo {

	public static void main(String[] args) {

		// max size =10
		// int a[] = new int[] { 10, 20, 30 };
		int a[] = new int[10];
		System.out.println(a.length);
		for (int i = 0; i < 10; i++) {

			a[i] = i * 100;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
		//

	}
}
