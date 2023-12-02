package com.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo3 {

	public static void main(String[] args) {
		
		Path path = Paths.get("royal");
		if(Files.exists(path)) {
			System.out.println("exists...");
		}
		else {
			
			System.out.println("not exsist..");
		}
		if(Files.isDirectory(path)) {
			
			System.out.println("folder..");
		}
		else {
			
			System.out.println("file...");
		}
		
		
	}
}
