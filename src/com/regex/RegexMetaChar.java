package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetaChar {

	public static void main(String[] args) {
		
		//Pattern pattern = Pattern.compile("\\D+");
		//Pattern pattern = Pattern.compile("\\S+");
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher("#$&*");
		System.out.println(matcher.matches());
		
		
		
	}
}
