package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//regex regular expression...
//"Sam@123" --> 1 cap,1 small, 1spec, 1 num
// Pattern Class
// Mathcer class
public class Regexdemo1 {

	
	public static void main(String[] args) {
		
		//.
		Pattern pattern = Pattern.compile(".s"); // as // s and before that 1 char...
		Matcher matcher = pattern.matcher(" s");
		System.out.println(matcher.matches());
		
	}
}
