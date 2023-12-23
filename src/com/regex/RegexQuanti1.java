package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuanti1 {

	public static void main(String[] args) {
		
		
		Pattern pattern = Pattern.compile("[a-zA-Z]{5,10}");
		Matcher matcher = pattern.matcher("samir");
		System.out.println(matcher.matches());
		
	}
}
