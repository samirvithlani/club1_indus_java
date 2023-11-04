package com.file.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

//		File file = new File("demo.txt");
//		try {
//			FileWriter writer = new FileWriter(file,true);
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			FileWriter writer = new FileWriter("demo.txt",true);
			writer.write("Hello this is dirst line from file...");
			writer.close(); // close...
			System.out.println("Data  write succesfully....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
