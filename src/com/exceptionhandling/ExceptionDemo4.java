package com.exceptionhandling;

import java.io.IOException;

public class ExceptionDemo4 {

	public void divide(int no1, int no2) throws IOException {

		int c = no1 / no2;
		System.out.println(c);

	}

	public static void main(String[] args) {

		
		ExceptionDemo4 e4 = new ExceptionDemo4();
		//e4.divide(10, 2);
	}
}
