package com.sf.beans;

public class Address {

	// prop
	private int houseNo;
	private String cityString;
	private int pincode;

	
	// by using setter inj
	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


   //constructorr
	
	public Address (int houseNo , String cityString , int pincode) {
		this.houseNo=houseNo;
		this.cityString=cityString;
		this.pincode=pincode;
	}
	
	
	@Override
	public String toString() {
		return "#"+houseNo + ", " +cityString+","+pincode ;
				
	}

}
