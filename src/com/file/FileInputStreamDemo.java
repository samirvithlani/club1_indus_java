package com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		// stream

		try {
			FileOutputStream out = new FileOutputStream("out.txt");
			String data = "Hello this is my byte data";
			byte b[] = data.getBytes();
			out.write(b);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
