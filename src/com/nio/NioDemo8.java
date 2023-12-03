package com.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo8 {

	public static void main(String[] args) {
		
		Path p1  = Paths.get("users\\samir\\doc\\abc\\java.txt");
		Path p2 =  Paths.get("users\\samir\\doc\\java1.txt");
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
				
	}
}
