package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Name");
		String name = sc.nextLine();
		
		Pattern pattern = Pattern.compile("\\S+");
		Matcher matcher = pattern.matcher(name);
		System.out.println(matcher.matches());
		
	}
}
