package com.exceptionhandling;

public class GetData {

	public static void main(String[] args)  {
		
		try {
			getData();
		} catch (CheckNameException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		finally {
			//conn opne... close///
			//file ope close...
			System.out.println("transmanagement...");
			
		}
	}
	
	public static void getData() throws CheckNameException {
		
		
		
		String name = "ram";
		//must len>3
		
		if(name.length()<=3) {
			
			throw new CheckNameException(name + " is not valid Param...");
		}
		

	}
}
