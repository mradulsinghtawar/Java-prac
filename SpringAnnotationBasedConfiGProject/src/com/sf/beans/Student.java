package com.sf.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
// prop
	//getter , setterr
	
	@Value("201")
	private int rollno;
	
	@Value("john")
	private String nameString;
	
	@Value("90.5")
	 private  double marks;
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	// disp
	
	public void display() {
		
		System.out.println("student detailllll");
		System.out.println("roll no " +this.rollno);
		System.out.println("name " +this.nameString);
		System.out.println("marks " +this.marks);
			
	}
}
