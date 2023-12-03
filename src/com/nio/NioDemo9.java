package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NioDemo9 {

	public static void main(String[] args) {
		
		
		Path path = Paths.get("C:\\Users\\Samir\\Desktop");
		System.out.println(Files.isExecutable(path));
		try {
			System.out.println(Files.isHidden(path));
			System.out.println(Files.isRegularFile(path));
			System.out.println(Files.isWritable(path));
			
			
			Stream<Path> list = Files.list(path);
			list.forEach((s)->System.out.println(s));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
