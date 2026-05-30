 package com.desiqna.sp.beans;

import java.util.jar.Attributes.Name;

public class Employee {
	 private int employeeID;
	 private  String empName;
	 private String empEmail;
	 private int Salary;
	 
	 
	
	 
	 
	 public int getEmployeeID() {
		return employeeID;
	}





	 public void setEmployeeID(int employeeID) {
		 this.employeeID = employeeID;
	 }





	 public String getEmpName() {
		 return empName;
	 }





	 public void setEmpName(String empName) {
		 this.empName = empName;
	 }





	 public String getEmpEmail() {
		 return empEmail;
	 }





	 public void setEmpEmail(String empEmail) {
		 this.empEmail = empEmail;
	 }





	 public int getSalary() {
		 return Salary;
	 }





	 public void setSalary(int salary) {
		 Salary = salary;
	 }





	 public void  display() {
		 System.out.println("employee id"+this.employeeID);
		 System.out.println("employee name"+this.empName);
		 System.out.println("employee  mail"+this.getEmpEmail());
		 System.out.println("employee id"+this.getSalary());
			
	}
	 
	 
}
