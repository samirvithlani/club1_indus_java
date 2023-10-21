package com.date;

import java.util.Date;


///please enter your birth year
//month
//day -->  age -->
public class DateDemo2 {

	public static void main(String[] args) {

		Date today = new Date();
		Date tomorrow = new Date();
		tomorrow.setDate(today.getDate() + 1);
		
		System.out.println(today);
		System.out.println(tomorrow);
		
		
		System.out.println(today.after(tomorrow));
		System.out.println(today.before(tomorrow));
		
		

	}
}
