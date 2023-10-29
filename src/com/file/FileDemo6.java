package com.file;

import java.io.File;

public class FileDemo6 {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\Samir\\Desktop\\ab.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		System.out.println(file.isHidden());
		
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		File files[] = File.listRoots();
		for(File f:files) {
			
			System.out.println(f);
		}
		
		System.out.println(file.getFreeSpace());
		
	}
}
