package com.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class BirthDate {
	public static void main(String[] args) {

		LocalDate localdate = LocalDate.now();
		int years = Calendar.getInstance().get(Calendar.YEAR);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your Birthdate");

		System.out.print("Enter Day : ");
		String scanDay = scanner.next();
		int day = Integer.parseInt(scanDay);
		
		System.out.print("Enter Month : ");
		String scanMonth = scanner.next();
		int month = Integer.parseInt(scanMonth);
		
		System.out.print("Enter Year : ");
		String scanYear = scanner.next();
		int year = Integer.parseInt(scanYear);
		
		LocalDate birthdate = LocalDate.of(year, month, day);
		LocalDate nextBirthday = birthdate.plusYears(years - year + 1);

		DayOfWeek dayofWeek = nextBirthday.getDayOfWeek();
		System.out.println("Day of Week on your Birthdate - "+day+"/"+month+"/"+year+" is " + dayofWeek);
	}
}
