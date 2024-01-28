package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("amit");
		set.add("jay");
		set.add("kunal");
		set.add("ram");
		set.add("parth");
		
		for(String s:set) {
			
			System.out.println(s);
		}
	}
}
