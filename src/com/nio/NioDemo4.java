package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo4 {

	public static void main(String[] args) {

		Path source = Paths.get("nio.txt");
		Path desti = Paths.get("a2/nio.txt");
		
		try {
			Files.move(source, desti);
			System.out.println("file copied..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
