package com.java8;

public class MethodReferenceStudent {

	public static void main(String[] args) {
		StudentFactory factory = Student::new;
		
		Student student = factory.getInstance();
		student.setFirstName("John");
		student.setLastName("cena");
		student.setSem1Marks(66);
		student.setSem2Marks(83);
		student.setSem3Marks(81);
		student.setSem4Marks(75);
		student.setSem5Marks(63);
		student.setSem6Marks(72);
		
		ComputeAverage average = student::getAverageMarks;
		System.out.println("Average marks = "+ average.average());

	}

}
