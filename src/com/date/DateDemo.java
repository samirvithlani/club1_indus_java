package com.date;

import java.util.Date;

//java.util.Date --> depricated...
//java.util.Calander
//DateTimeAPi
//DateApi
//TimeAPi
//milii seconds... 1st jan 1970 -->
//timezone GMT + 5 30 
public class DateDemo {

	public static void main(String[] args) {

		Date date = new Date();
		// Date date = new Date(1);
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getDay()); // 6
		System.out.println("hours" + date.getHours());
		System.out.println("mins" + date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println("time...." + date.getTime());

		//1900 + 100
		Date date2 = new Date();
		date2.setYear(100);
		date2.setMonth(1);
		date2.setHours(12);
		date2.setMinutes(00);
		date2.setDate(14);
//		date2.setDate(14);
//		date2.setMonth(1); // feb
//		date2.setYear(2000);
//		date2.setTime(12);
//		date2.setMinutes(00);

		System.out.println("date 2 ---" + date2);

	}

}
