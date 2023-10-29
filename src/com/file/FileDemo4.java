package com.file;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291\\jmc.txt");
		File files[] = file.listFiles();
		System.out.println(files);
		
		if (files != null) {
			for (File f : files) {

				System.out.println(f);
			}
		}
		else {
			
			System.out.println("no file found..");
		}

	}
}
