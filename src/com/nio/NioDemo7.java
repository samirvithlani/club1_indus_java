package com.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo7 {

	public static void main(String[] args) {
		
		
		Path path = Paths.get("drive\\temp\\java\\");
		Path path2 = Paths.get("programmes\\ws\\text1.txt");
		
		Path resPath =  path.resolve(path2);
		
		System.out.println(resPath);
		
				
	}
}
