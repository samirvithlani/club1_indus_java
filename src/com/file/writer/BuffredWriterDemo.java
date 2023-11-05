package com.file.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffredWriterDemo {

	public static void main(String[] args) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("java.txt",true));
			writer.write("from buffered..");
			System.out.println("data write successfully..");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
