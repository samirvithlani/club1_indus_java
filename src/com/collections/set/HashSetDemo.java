package com.collections.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("jay");
		hs.add("ok");
		hs.add("amit");
		hs.add("kunal");
		hs.add("parth");

		System.out.println("conatins..." + hs.contains("amit"));

		for (String s : hs) {
			System.out.println(s);
		}

	}
}
