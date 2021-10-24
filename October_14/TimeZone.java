package com.java8;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println("Time in different cities of the World");
		
		ZoneId zone = ZoneId.of("BST", ZoneId.SHORT_IDS);
		LocalTime now = LocalTime.now(zone);
		System.out.println("Time in London : " + now.format(formatter));

		zone = ZoneId.of("CET", ZoneId.SHORT_IDS);
		now = LocalTime.now(zone);
		System.out.println("Time in Berlin : " + now.format(formatter));

		zone = ZoneId.of("EST", ZoneId.SHORT_IDS);
		now = LocalTime.now(zone);
		System.out.println("Time in New York : " + now.format(formatter));

		zone = ZoneId.of("IST", ZoneId.SHORT_IDS);
		now = LocalTime.now(zone);
		System.out.println("Time in Mumbai : " + now.format(formatter));

		zone = ZoneId.of("SST", ZoneId.SHORT_IDS);
		now = LocalTime.now(zone);
		System.out.println("Time in Singapore : " + now.format(formatter));
	}
}
