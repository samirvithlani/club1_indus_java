package com.date.tz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneConverter {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		String japanTime = sdf.format(new Date());
		System.out.println(japanTime);

	}
}
