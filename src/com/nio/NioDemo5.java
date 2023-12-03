package com.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo5 {

	
	public static void main(String[] args) {
		
		
		Path path = Paths.get("C:\\Users\\Samir\\Desktop\\java.txt");
		System.out.println(path.getFileName());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileSystem());
		
		
		
		
	}
}
