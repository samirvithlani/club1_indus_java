package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream in = new FileInputStream("out.txt");
			int c =0;
			while((c=in.read())!=-1){
				System.out.print((char)c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
