package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateForateDemo {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss");
//		SimpleDateFormat sdf = 
//				new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss zzzz");
//		SimpleDateFormat sdf = 
//				new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss zzzz a S F");
		SimpleDateFormat sdf = 
				new SimpleDateFormat("dd-MMMM-yyyy w W k X");
		String strDate = sdf.format(date);
		System.out.println(strDate);

	}
}
