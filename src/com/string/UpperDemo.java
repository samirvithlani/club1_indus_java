package com.string;

public class UpperDemo {

	// A -> 65
	// a -> 97

	public static String convertUpper(String name) {
		int c;
		String upper ="";
		for (int i = 0; i < name.length(); i++) {

			// System.out.println((int)name.charAt(i));
			if ((int) name.charAt(i) >= 97 && (int) name.charAt(i) <= 122) {

				c = (int) name.charAt(i) - 32;
				System.out.println((char)c);
				upper = upper+(char)c;
				
			}
		}
		System.out.println(upper);

		return upper;
	}

	public static void main(String[] args) {

		System.out.println(convertUpper("raj"));
	}
}
