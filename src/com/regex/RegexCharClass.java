package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCharClass {

	public static void main(String[] args) {
		
		//Pattern pattern = Pattern.compile("[abc]");
		//Pattern pattern = Pattern.compile("[^abc]");
		//Pattern pattern = Pattern.compile("[A-Za-z]");
		//Pattern pattern = Pattern.compile("[a-z]");
		//Pattern pattern = Pattern.compile("[0-9]");
		//Pattern pattern = Pattern.compile("[a-e[r-z]]");
		Pattern pattern = Pattern.compile("[a-z&&[^p-u]]");
		Matcher matcher = pattern.matcher("v");
		
		System.out.println(matcher.matches());
		
		
	}
}
