package com.springcorebeans;

public class Student {

	private int rollNo;
	private String Name ;
	private String email ;
	private Address address;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	 @Override
	    public String toString() {
	        return "Student [rollNo=" + rollNo
	                + ", Name=" + Name
	                + ", email=" + email
	                + ", address=" + address
	                + "]";
	    }
}
