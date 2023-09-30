package com.array;

import java.util.Arrays;

public class ArrayDemo4 {

	public static int[] doSortAndMul(int a[]) {

		Arrays.sort(a);
		// for each loop.
//		for i in a
		for(int i=0;i<a.length;i++) {
			
			a[i] = a[i]*2;
		}
			
		return a;

	}

	public static void main(String[] args) {

		int a[] = new int[] { 10, 45, 1, 23, 4, 34 };

		int x[] = ArrayDemo4.doSortAndMul(a);
		
		for(int i:x) {
			
			System.out.println(i);
		}

	}
}
