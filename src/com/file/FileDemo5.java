package com.file;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {

		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291");
		String files[] = file.list();

		// same check null...
		for (String s : files) {

			System.out.println(s);
		}
	}
}
