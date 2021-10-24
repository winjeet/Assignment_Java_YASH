package com.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class CountYear {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(1947, Month.AUGUST, 15);
		LocalDate today = LocalDate.now();
		Period period = localDate.until(today);
		System.out.println("Number of years between "+localDate+" to "+today+" : "+period.getYears());	
	}
}
