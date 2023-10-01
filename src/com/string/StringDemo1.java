package com.string;

public class StringDemo1 {

	public static void main(String[] args) {

		String str = "java";
		// String st = new String("python");
		// System.out.println(st);
		System.out.println(str);
		// array --> 0 char array

		System.out.println(str.charAt(0));
		char c = str.charAt(1);
		System.out.println(c);

		for (int i = 0; i < str.length(); i++) {

			System.out.println("i = " + str.charAt(i));
		}

		int ind = str.indexOf('a');
		System.out.println("index of  =" + ind);
		ind = str.lastIndexOf('a');
		System.out.println("last index of.." + ind);

		String fname = "ram";
		String lName = "sita";

		fname = fname.concat("rama");

		String fullName = fname.concat(lName);
		System.out.println("last name = " + fullName);

		// trim...

		String email = "  hello@gmail.com ";
		System.out.println("email = " + email);
		System.out.println(email.length());

		// white space remove from first last..

		email = email.trim();
		System.out.println("email = " + email);
		System.out.println("len after trim " + email.length());

	}
}
