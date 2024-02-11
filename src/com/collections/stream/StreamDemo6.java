package com.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo6 {

	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<String>();
		names.add("raj");
		names.add("parth");
		names.add("jay");
		names.add("amit");
		names.add("neha");
		names.add("kunal");
		names.add("priya");

		
//		long data = names.stream().count();
		long data = names.stream().filter(x->x.startsWith("a")).count();
		System.out.println(data);
		
	}
}
