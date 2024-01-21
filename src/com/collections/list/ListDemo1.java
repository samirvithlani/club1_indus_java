package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {

		// ref --> list
		// memory -->arrayList
		// list stors data in index..
		List<String> users = new ArrayList<String>();
		users.add("ram");
		users.add("seeta");
		users.add("lakshman");
		users.add(2, "hanuman");
		users.add("dashrath");
		
		
		
		System.out.println("contains..."+users.contains("ram"));
		//users.clear();
		System.out.println("isEMpty..."+users.isEmpty());
		
		System.out.println("index..."+users.indexOf("seeta"));
		
		//0 1 2    3will n=be ex
		List<String> ss = users.subList(1, 3);
		System.out.println(ss);
		
		Object strarr[] = users.toArray();
		System.out.println(strarr);
		
//		for(Object o:strarr) {
//			System.out.println("o->"+o);
//		}
		 
		
		//users.remove("seeta");

		// System.out.println(users[0]); error
		//System.out.println(users.get(0));
		
//		for(int i=0;i<users.size();i++) {
//			System.out.println(users.get(i));
//		}
		
		//System.out.println(users);
		for(String s:users) {
			
			System.out.println(s);
		}

	}
}
