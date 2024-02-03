package com.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//map interface -> TreeMap HashMap
public class MapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(1, "amit");
		map.put(22, "ram");
		map.put(7, "sita");
		map.put(44, "kunal");
		map.put(3, "kunal");
		map.put(7, "seeta");
		map.putIfAbsent(7, "lakshman");

		// String removedItem = map.remove(45);
		// System.out.println("remvoing..."+removedItem);

		// map.remove(44,"kunal");

		// map.isEmpty();
		System.out.println("get --" + map.get(7));
		Set<Integer> keys = map.keySet();

		for (int i : keys) {
			System.out.println("keys " + i);
		}

		// map.values();

		// map.replace(33, "lakshman");
//		map.replace(3, "kunal1", "lakshman");

		// Entry is inner interface
		// map{Interface Entery}
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
