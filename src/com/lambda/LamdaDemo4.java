package com.lambda;

interface Convert {

	String upperCase(String name);
}

public class LamdaDemo4 {

	public static void main(String[] args) {
		
		Convert c = (str)->{
			if(str.length()>3) {
				
				return str.toUpperCase();
			}
			
			return str;
		};
		
		String s = c.upperCase("raja");
		System.out.println(s);
	}
}
