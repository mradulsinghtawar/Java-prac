package com.sf.beans;

public class Student {

	// props
	private int rollNo;
	private String name;
	private String email;
	private Address address;

	
	// setter
	

	public int getRollNo() {
		return rollNo;
	}


//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}


	public String getName() {
		return name;
	}


//	public void setName(String name) {
//		this.name = name;
//	}


	public String getEmail() {
		return email;
	}


//	public void setEmail(String email) {
//		this.email = email;
//	}
//

	public Address getAddress() {
		return address;
	}


//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
	
	//constructorr
	
	public Student(int rollNo,String name,String email , Address address  ) {
		this.rollNo=rollNo;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	 
	
	//display
	public void  display() {
		
		System.out.println("student detailllll");
		System.out.println("roll no " +this.rollNo);
		System.out.println("name " +this.name);
		System.out.println("mail " +this.email);
		System.out.println("marks " +this.address);
		
		
	}

	

}
