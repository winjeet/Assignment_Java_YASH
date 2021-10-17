package com.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int[] marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
}


package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersistStudentData {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();

		Student student1 = new Student();
		student1.setId(101);
		student1.setName("Rishabh");
		int marks1[] = { 80, 78, 96, 55, 60 };
		student1.setMarks(marks1);
		studentList.add(student1);

		Student student2 = new Student();
		student2.setId(102);
		student2.setName("Raghav");
		int marks2[] = { 70, 68, 86, 75, 77 };
		student2.setMarks(marks2);
		studentList.add(student2);

		Student student3 = new Student();
		student3.setId(103);
		student3.setName("Priyansh");
		int marks3[] = { 90, 78, 96, 95, 69 };
		student3.setMarks(marks3);
		studentList.add(student3);

		Student student4 = new Student();
		student4.setId(104);
		student4.setName("Riya");
		int marks4[] = { 50, 68, 56, 65, 80 };
		student4.setMarks(marks4);
		studentList.add(student4);

		try (OutputStream output = new FileOutputStream("D:\\FileIO\\Student.dat");
				ObjectOutputStream object = new ObjectOutputStream(output);) {
			object.writeObject(studentList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class GetStudentData {

	public static void main(String[] args) {
		try(InputStream input = new FileInputStream("D:\\FileIO\\Student.dat");
			ObjectInputStream object = new ObjectInputStream(input);
			){
				Student student = (Student) object.readObject();
				System.out.println(student);		
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

