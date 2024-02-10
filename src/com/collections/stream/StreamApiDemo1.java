package com.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiDemo1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("amit");
		names.add("raj");
		names.add("parth");
		names.add("anuj");
		names.add("arna");
		names.add("neha");

//		List<String> fillist = new ArrayList<String>();
//		
//		for(String s:names) {
//			
//			if(s.startsWith("a")) {
//				fillist.add(s);
//			}
//			
//		}

//		List<String> filelist = names.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
//		for(String s:filelist) {
//			
//			System.out.println(s);
//		}
		
		
		
		
		names.stream().filter(x->x.startsWith("a")).forEach(x->System.out.println(x));

	}
}
