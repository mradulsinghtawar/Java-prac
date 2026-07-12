package com.sf.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	 private int rollNo;
	 private String name;
	 private String  email;
	 
	  @Autowired
	  private Address address;
	  
	  private Subjects subjects;
	  
	
	  public int getRollNo() {
		  return rollNo;
	  }
	  public void setRollNo(int rollNo) {
		  this.rollNo = rollNo;
	  }
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public String getEmail() {
		  return email;
	  }
	  public void setEmail(String email) {
		  this.email = email;
	  }
	  public Subjects getSubjects() {
			return subjects;
		}
		  public void setSubjects(Subjects subjects) {
			  this.subjects = subjects;
		  }
	  public void  display() {
		  
		  System.out.println("student name "+ this.name);
		  System.out.println("student  roll no "+ this.rollNo);
		  System.out.println("student email "+ this.email);
		  System.out.println("student address "+ this.address);
		  System.out.println("student sub "+ this.subjects);
		 

	}
	
	  
}
