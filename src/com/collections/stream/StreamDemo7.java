package com.collections.stream;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

public class StreamDemo7 {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(70);
		marks.add(65);
		marks.add(36);
		marks.add(98);
		marks.add(67);
		
		
		//s1 100,s270 170
		//170 + 65 ->
		//235 + 36
		Optional<Integer> total = marks.stream().reduce((s1,s2)->s1+s2);
		
		total.ifPresent(x->System.out.println(x));
		
		
		
	}
}
