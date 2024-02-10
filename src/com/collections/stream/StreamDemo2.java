package com.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("amit");
		names.add("raj");
		names.add("parth");
		names.add("anuj");
		names.add("arna");
		names.add("neha");
		
//		for(String s:names) {
//			System.out.println(s.toUpperCase());
//		}
		
		//names.stream().map(String::toUpperCase).forEach(System.out::println);
		names.stream().map(String::toUpperCase).forEach(x->System.out.println(x));
		
		
		
	}
}
