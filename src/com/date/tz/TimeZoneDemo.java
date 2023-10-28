package com.date.tz;

import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {

		String availableZone[] = TimeZone.getAvailableIDs();

		for(String s: availableZone) {
			System.out.println(s);
		}
		

		TimeZone timeZone = TimeZone.getDefault();
		String localdisplayName = timeZone.getDisplayName();
		System.out.println(localdisplayName);

		TimeZone berlinTimeZone = TimeZone.getTimeZone("Asia/Tokio");
		System.out.println(berlinTimeZone.getDisplayName());

	}
}
