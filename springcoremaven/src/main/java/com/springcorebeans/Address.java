package com.springcorebeans;

public class Address {

	private int houseNo;
	private String cityName ;
	 private int pincode;
	 public int getHouseNo() {
		 return houseNo;
	 }
	 public void setHouseNo(int houseNo) {
		 this.houseNo = houseNo;
	 }
	 public String getCityName() {
		 return cityName;
	 }
	 public void setCityName(String cityName) {
		 this.cityName = cityName;
	 }
	 public int getPincode() {
		 return pincode;
	 }
	 public void setPincode(int pincode) {
		 this.pincode = pincode;
	 }
	 
	 
	 @Override
	 public String toString() {
		return "Address [cityName=" + cityName + ", houseNo=" + houseNo + ", pincode=" + pincode + "]";
	 }
	 
	 

}
