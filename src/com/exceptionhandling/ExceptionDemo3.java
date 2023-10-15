package com.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("");
		} catch (IOException e) {
			
			System.err.println("please check file name");
		}
		
	}
}
