package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
		
		String strDate = "2022-02-14 13 00";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh mm");
		try {
			Date date = sdf.parse(strDate);
			System.out.println(date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
}
