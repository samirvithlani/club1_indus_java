package com.exceptionhandling;

//extend exception class...

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg) {
		
		super(msg);
	}
	
	
}

public class CustomeException {
	
	public static void checkAge(int age) throws InvalidAgeException {
		
		if(age<18) {
			
			throw new InvalidAgeException("age is not valid...");
		}
		System.out.println(age);
		
		
		
	}
	
	public static void main(String[] args) {
		
		try {
			checkAge(9);
		} catch (InvalidAgeException e) {
			
			//System.out.println("invalid age..");
			System.out.println(e.getMessage());
		}
	}

}
