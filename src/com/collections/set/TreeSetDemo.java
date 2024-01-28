package com.collections.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("manan");
		ts.add("madam");
		ts.add("neha");
		ts.add("jaya");

		for (String s : ts) {
			System.out.println(s);
		}

		Set<String> newts = ts.subSet("madam", "neha");
		for (String s : newts) {
			System.out.println("subsert..." + s);
		}

		System.out.println("first.." + ts.first());
		// ts.last()

		System.out.println("higher  " + ts.higher("manan"));

		System.out.println("lower..." + ts.lower("neha"));

		System.out.println("celing..." + ts.ceiling("manav"));

		System.out.println("floor" + ts.floor("k"));

		SortedSet<String> tails = ts.tailSet("jaya");
		for (String s : tails) {

			System.out.println(s);
		}

		SortedSet<String> hs = ts.headSet("zara");
		for (String s : hs) {

			System.out.println("hs  " + s);
		}

	}
}
