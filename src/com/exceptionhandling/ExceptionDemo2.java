package com.exceptionhandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		
		String name  ="roayl";

		try {
		System.out.println(name.charAt(6));
		}catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("please check index..");
		}
		
	}
}
