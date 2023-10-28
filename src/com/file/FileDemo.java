package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		//D:\workspaces\java\java_club1
		// ./ current directory
		File file = new File("./abc.txt");
		try {
			boolean flag = file.createNewFile();
			if(flag==true) {
				System.out.println("file created..");
			}
			else {
				System.out.println("somethongwent wrong...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
