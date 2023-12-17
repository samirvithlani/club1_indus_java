package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactPatter {

	
	public static void main(String[] args) {
		
		
		Pattern pattern= Pattern.compile("[6-9]{1}[0-9]{9}");
		Matcher matcher = pattern.matcher("8460224296");
		System.out.println(matcher.matches());
	}
}
