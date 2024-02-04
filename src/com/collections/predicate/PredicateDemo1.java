package com.collections.predicate;

import java.util.function.Predicate;

//interface-->Test boolean
public class PredicateDemo1 {

	public static void main(String[] args) {

		Predicate<Integer> p = x -> x % 2 == 0;
		System.out.println(p.test(13));

		Predicate<String> p1 = x -> x.startsWith("a");
		System.out.println(p1.test("amit"));

		Predicate<Integer> isAdult = x -> x >= 18;
		System.out.println(isAdult.test(19));

		Predicate<String[]> isAvaialble = x -> x.length > 0;

		String s[] = new String[] {"ram"};
		System.out.println(isAvaialble.test(s));

	}

}
