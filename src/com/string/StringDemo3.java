package com.string;

public class StringDemo3 {

	public static void main(String[] args) {

		String str = "hello this is java";
		String words[] = str.split(" ");
		for(String s:  words) {
			
			System.out.println(s);
		}
		
		System.out.println(str.codePointAt(0));
		System.out.println(str.startsWith("h"));
		System.out.println(str.endsWith("a"));
		
		System.out.println(str.contains("i"));
		String s = String.valueOf(12);
		System.out.println(s+12);
	}
}
