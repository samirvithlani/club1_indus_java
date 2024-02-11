package com.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo4 {

	
	
	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>();
		names.add("raj");
		names.add("parth");
		names.add("jay");
		names.add("amit");
		names.add("neha");
		names.add("kunal");
		names.add("priya");
		
		
		//names.stream().sorted().forEach(x->System.out.println(x));
		//names.stream().sorted().map(String::toUpperCase).forEach(x->System.out.println(x));
		names.stream().sorted().filter(x->x.length()>3).forEach(x->System.out.println(x));
		
		
		
		
	}
}
