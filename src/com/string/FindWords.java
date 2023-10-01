package com.string;

public class FindWords {

	public static void main(String[] args) {
		
		String address = "hi this is india";
		int count =0;
		
		for(int i=0;i<address.length();i++) {
			
			if(address.charAt(i)==' ') {
				
				count++;
			}
		}
		System.out.println(count+1);
	}
	
}
