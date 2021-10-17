package com.serialization;
import java.io.Serializable;

public class Employee implements Serializable
{
	
	private int empId;
    private String  empFirstName;
    private String empLastName;
    private String empDOB;
    private String empGender;
    
    public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDOB=" + empDOB + ", empGender=" + empGender + "]";
	}
    
    
}


import java.io.Serializable;

public class Manager extends Employee implements Serializable
{
	
	private int managerId;
	transient private String empDOB;
	
	public Manager() {
		super();
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + "]";
	}   

}


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeManagerSerialize 
{

	public static void main(String[] args) throws Exception
	{
		Manager manager = new Manager();
		manager.setManagerId(001);
		manager.setEmpId(101);
		manager.setEmpFirstName("Lateek");
		manager.setEmpLastName("Tare");
		manager.setEmpDOB("01-05-1980");
		manager.setEmpGender("Male");
		

		   FileOutputStream FOS = new FileOutputStream("D:\\FileIO\\EmployeeManager.ser");
		   ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		   OOS.writeObject(manager);
		   
		   FileInputStream FIS = new FileInputStream("D:\\FileIO\\EmployeeManager.ser");
		   ObjectInputStream OIS = new ObjectInputStream(FIS);
		   
		   Manager M = (Manager)OIS.readObject();
		   System.out.println("ManagerID :"+" EmpID :"+" EmpFirstName :"+" EmplastName :"+" EmpDOB :"+" EmpGender");
		   System.out.println(M.getManagerId()+" : "+M.getEmpId()+" : "+M.getEmpFirstName()+" : "+M.getEmpLastName()+" : "+M.getEmpDOB()+" : "+M.getEmpGender());
	
	}

}