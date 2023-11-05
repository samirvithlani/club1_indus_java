package com.file.Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		FileReader reader;
		try {
			String data = "";
			reader = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			BufferedReader br = new BufferedReader(reader);

			// br.read();

//			data = br.readLine();

//			System.out.println(data);
			long startTime = System.nanoTime();
			while ((data = br.readLine()) != null) {

				System.out.println(data);
			}
			long endTime = System.nanoTime();
			
			long totaltime  =endTime - startTime;
			System.out.println(totaltime /1000000000);

		} catch (FileNotFoundException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
