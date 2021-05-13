package com.ojas.spring.SpringCoreXML.model;

public class EmpAddress {
	private String city;
	private String Country;
	private int houseNo;

	public EmpAddress() {
		super();
	}

	public EmpAddress(String city, String country, int houseNo) {
		super();
		this.city = city;
		Country = country;
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "EmpAddress [city=" + city + ", Country=" + Country + ", houseNo=" + houseNo + "]";
	}

}