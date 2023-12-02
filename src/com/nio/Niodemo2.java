package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Niodemo2 {

	public static void main(String[] args) {
		
		Path path = Paths.get("royal/r/s/t/u/v");
		try {
			//Files.createDirectory(path);
			Files.createDirectories(path);
			System.out.println("folder creaeted....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
}
