package com.student.sort;

import java.util.Arrays;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String firstName;
	private String lastName;
	private int age;
	private int[] semMarks=new int[3];
	private int percentage;
	private int total;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int[] getSemMarks() {
		return semMarks;
	}
	public void setSemMarks(int[] semMarks) {
		this.semMarks = semMarks;
	}
	public float percentage(int[] semMarks)
	{
		for(int i=0;i<semMarks.length;i++)
			total=total+semMarks[i];
		
		percentage=(total/300)*100;
		return percentage;
		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", semMarks=" + Arrays.toString(semMarks) + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.age>o.age)
			return 1;
		else 
		if(this.age<o.age)
			return -1;
		else return 0;
	}
	
	
}


package com.student.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class SortedStudent {
	
	class SortedStudentBasedOnFirstName implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getFirstName().compareTo(s2.getFirstName());
		}
	}	
	class SortedStudentBasedOnLastName implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getLastName().compareTo(s2.getLastName());
		}
	}
		
	
	public static void main(String[] args)
	{
		List <Student> studentList= new ArrayList<>();
		
		Scanner input= new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Student"+i+1);
			
			System.out.print("Enter roll no:");
			int rollNo= input.nextInt();
			
			System.out.print("Enter first name:");
			String firstName=input.next();
			
			System.out.print("Enter last name:");
			String lastName=input.next();
			
			System.out.print("Enter age:");
			int age=input.nextInt();
			
			
			System.out.println("Enter Semester marks:");
			int marks[] = new int[3];
			for(int j=0;j<3;j++)
			{
				marks[j] = input.nextInt();
			}
			
			Student student =new Student();
			student.setRollNo(rollNo);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setSemMarks(marks);
			
			studentList.add(student);
			
		}
		
		
		System.out.println("Student Record");
		for( Student student: studentList) {
			System.out.println(student);
		}
		Collections.sort(studentList);
		
		System.out.println("Student Records based on Age:");
		for(Student student: studentList) {	
			System.out.println(student);	
		}
		
		System.out.println("Student Records based on First Name");
		Collections.sort(studentList, new SortedStudent() .new SortedStudentBasedOnFirstName());
		for(Student student: studentList) {
			System.out.println(student);
		}
		
		System.out.println("Student Records based on Last Name");
		Collections.sort(studentList, new SortedStudent() .new SortedStudentBasedOnLastName());
		for(Student student: studentList) {
			System.out.println(student);
		}
			
	}
	
	
}
