package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	// treeSet -->sorted.
	// HashSet -->Hashtable
	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();
		set.add("java");
		set.add("python");
		set.add("c");
		set.add("node");
		set.add("c");

		// set is not suscritable..
		// System.out.println(""+set.remove("node"));
		// System.out.println(set.contains("c"));
		// set.clear();
		// System.out.println(set.isEmpty());

		System.out.println(set.toString());

		for (String s : set) {
			System.out.println(s);
		}

	}
}
