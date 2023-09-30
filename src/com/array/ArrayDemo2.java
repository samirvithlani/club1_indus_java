package com.array;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int a[] = new int[] { 12, 22, 45, 67, 50 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		int ind = Arrays.binarySearch(a, 45);
		System.out.println("index = " + ind);

		int hash = Arrays.hashCode(a);
		System.out.println(hash);

		String sarr = Arrays.toString(a);
		System.out.println(sarr);
		System.out.println(sarr.charAt(3));

		byte b = 0;
		Arrays.fill(a, b);
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}
}
