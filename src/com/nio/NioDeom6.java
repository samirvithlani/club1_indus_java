package com.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDeom6 {

	
	public static void main(String[] args) {
		
		Path path = Paths.get("drive\\temp\\Java");
		
		String passedPath = "x";
		Path resolvedPath = path.resolve(passedPath);
		System.out.println(resolvedPath);
	}
}
