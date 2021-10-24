package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<StudentBuilder> studentList = StudentBuilder.getStudentList();

		List<StudentBuilder> nameContainAI = studentList.stream().filter((n) -> n.getFirstName().contains("ai"))
				.collect(Collectors.toList());
		nameContainAI.forEach(System.out::println);

		long countNameStartWithK = studentList.stream().filter((n) -> n.getFirstName().startsWith("k")).count();

		System.out.println(countNameStartWithK);

		studentList.forEach(
				(n) -> System.out.println(n.getFirstName().toUpperCase() + " " + n.getLastName().toUpperCase()));

	}
}
