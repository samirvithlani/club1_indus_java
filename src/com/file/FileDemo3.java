package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("src/com/file/th.txt");
		String abspath = file.getAbsolutePath();
		System.out.println("abs path = "+abspath);
		
		//File file2 = new File("th.txt");
		File file2 = file.getAbsoluteFile();
		
		System.out.println(file2.isFile());
		
		try {
			System.out.println(file.getCanonicalFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}
}
