package com.ojas.spring.SpringCoreXML.model;

public class EmpCompany {
	private String companyName;
	private String companyLocation;

	public EmpCompany() {
		super();
	}

	public EmpCompany(String companyName, String companyLocation) {
		super();
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}

	@Override
	public String toString() {
		return "EmpCompany [companyName=" + companyName + ", companyLocation=" + companyLocation + "]";
	}

}