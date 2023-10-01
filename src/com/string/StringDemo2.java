package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String lang = "ahindi";
		
		System.out.println("lang = "+lang);
		
		lang = lang.toUpperCase();
		
		System.out.println("after upper case lang = "+lang);
		
		lang = lang.toLowerCase();
		System.out.println("after lowee case lang = "+lang);
			
		int x = lang.codePointAt(0);
		System.out.println("x = "+x);
		
		
	}
}
