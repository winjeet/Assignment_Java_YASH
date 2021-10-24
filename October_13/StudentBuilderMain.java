package com.java8;

import java.util.List;

public class StudentBuilderMain {

	public static void main(String[] args) {
		List<StudentBuilder> studentBuilderList = StudentBuilder.getStudentList();
		studentBuilderList.forEach(System.out::println);
	}

}
