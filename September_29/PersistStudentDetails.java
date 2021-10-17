package com.io;

public class StudentDetails {
	
	private int sRollNo;
	private String sName;
	private int marksSem1;
	private int marksSem2;
	private int marksSem3;
	private int marksSem4;
	private double percentage;
	
	public int getsRollNo() {
		return sRollNo;
	}
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getMarksSem1() {
		return marksSem1;
	}
	public void setMarksSem1(int marksSem1) {
		this.marksSem1 = marksSem1;
	}
	public int getMarksSem2() {
		return marksSem2;
	}
	public void setMarksSem2(int marksSem2) {
		this.marksSem2 = marksSem2;
	}
	public int getMarksSem3() {
		return marksSem3;
	}
	public void setMarksSem3(int marksSem3) {
		this.marksSem3 = marksSem3;
	}
	public int getMarksSem4() {
		return marksSem4;
	}
	public void setMarksSem4(int marksSem4) {
		this.marksSem4 = marksSem4;
	}
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double studentPercentage) {
		this.percentage = studentPercentage;
	}
	@Override
	public String toString() {
		return "StudentDetails [sRollNo=" + sRollNo + ", sName=" + sName + ", marksSem1=" + marksSem1
				+ ", marksSem2=" + marksSem2 + ", marksSem3=" + marksSem3 + ", marksSem4=" + marksSem4
				+ ", percentage=" + percentage + "]";
	}
	
	

}


package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersistStudentDetails {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		StudentDetails s =new StudentDetails();
		
		double studentPercentage;
		int sum=0;
				
		System.out.print("Enter student rollNo:");
		int rollno = input.nextInt();
		s.setsRollNo(rollno);
		
		System.out.print("Enter student Name:");
		String Name = input.next();
		s.setsName(Name);
		
		System.out.println("Enter student marks for sem 1");
		int marksSem1 = input.nextInt();
		s.setMarksSem1(marksSem1);
		sum=sum+marksSem1;
		
		System.out.println("Enter student marks for sem 2");
		int marksSem2 = input.nextInt();
		s.setMarksSem2(marksSem2);
		sum=sum+marksSem2;
		
		System.out.println("Enter student marks for sem 3");
		int marksSem3 = input.nextInt();
		s.setMarks_sem3(marksSem3);
		sum=sum+marksSem3;
		
		System.out.println("Enter student marks for sem 4");
		int marksSem4 = input.nextInt();
		s.setMarks_sem4(marksSem4);
		sum=sum+marksSem4;
		
		studentPercentage = (sum/(4*100))*100;
		s.setPercentage(studentPercentage);
		List<StudentDetails> student = new ArrayList<>();
		student.add(s);
		
		ObjectMapper mapper=new ObjectMapper();
		OutputStream os=new FileOutputStream("D:\\FileIO\\student.dat");
		mapper.writeValue(os, student);

	}

}