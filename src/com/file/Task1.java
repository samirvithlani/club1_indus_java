package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

	public static String isPalindrome(String name) {

		// System.out.println(name);
		StringBuffer sb = new StringBuffer(name);
		String str1 = sb.reverse().toString();
		// System.out.println(str1);

		if (name.equals(str1)) {
			return name;
		}

		return null;

	}

	public static void readDataFromFile() {

		try {

//		String data = "naman1";
//		String revName = isPalindrome(data);
//		System.out.println(revName);

			Scanner sc = new Scanner(new File("dictonry"));
			while (sc.hasNext()) {

				String data = isPalindrome(sc.next());
				if (data != null) {

					System.out.println(data);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		readDataFromFile();
	}
}
