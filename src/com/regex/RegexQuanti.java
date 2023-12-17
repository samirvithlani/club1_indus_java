package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuanti {

	public static void main(String[] args) {
		
		//Pattern pattern = Pattern.compile("[abc]?");
		//Pattern pattern = Pattern.compile("[abc]+");
		//Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		//Pattern pattern = Pattern.compile("[a-z]{8}");
		//Pattern pattern = Pattern.compile("[a-z]{8,}");
		Pattern pattern = Pattern.compile("[a-z]{8,10}");
		Matcher matcher = pattern.matcher("abcdefghijk");
		System.out.println(matcher.matches());
		 
	}
}
