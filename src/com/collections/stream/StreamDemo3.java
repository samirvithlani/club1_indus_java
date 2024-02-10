package com.collections.stream;

import java.util.ArrayList;

import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {

		List<Integer> sales = new ArrayList<Integer>();
		sales.add(100);
		sales.add(120);
		sales.add(90);
		sales.add(23);
		sales.add(55);

		sales.stream().filter(x -> x > 70).map(s -> s * 10).forEach(x -> System.out.println(x));

		// sales.stream().map(s->s*10).forEach(s->System.out.println(s));

	}
}
