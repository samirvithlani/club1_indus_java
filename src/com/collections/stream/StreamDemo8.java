package com.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo8 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("raj");
		names.add("parth");
		names.add("ajay");
		names.add("jay");
		names.add("amit");
		names.add("neha");
		names.add("kunal");
		names.add("priya");
		names.add("anaya");
		
		
		
		String find = names.stream().filter(x->x.startsWith("n")).findFirst().get();
		System.out.println(find);
		
		
		
		
	}
}
