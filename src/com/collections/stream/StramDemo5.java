package com.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class StramDemo5 {

	public static void main(String[] args) {
		

		List<String> names = new ArrayList<String>();
		names.add("raj");
		names.add("parth");
		names.add("jay");
		names.add("amit");
		names.add("neha");
		names.add("kunal");
		names.add("priya");
		
		
		
		boolean matchRes = names.stream().anyMatch(s->s.startsWith("z"));
		System.out.println(matchRes);
		boolean matchRes1 = names.stream().allMatch(s->s.length()>=3);
		System.out.println(matchRes1);
		
		boolean matchRes2 = names.stream().noneMatch(x->x.startsWith("x"));
		System.out.println(matchRes2);
		
	}
}
