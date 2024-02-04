package com.collections.generics;

public class GenericsDemo1<T> {

//	public void add(String s) {
//		
//		System.out.println("add called.");
//	}

	public void add(T s) {
		System.out.println(s);
	}

	public void add(int s) {
		System.out.println("ad....." + s);
	}

	public static void main(String[] args) {

		// GenericsDemo1 g1 = new GenericsDemo1();
		GenericsDemo1<String> g1 = new GenericsDemo1<String>();
		g1.add("ram");
		GenericsDemo1<Integer> g2 = new GenericsDemo1<Integer>();
		g2.add(100);
		GenericsDemo1 g3 = new GenericsDemo1();
		g3.add(100);
		g3.add(false);

	}
}
