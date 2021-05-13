package com.ojas.spring.SpringCoreXML.model;

public class EmployeeConstr {
	private int id;
	private String name;
	private EmpAddress address;
	private EmpCompany company;

	public EmployeeConstr(int id, String name, EmpAddress address, EmpCompany company) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.company = company;
	}

	@Override
	public String toString() {
		return "EmployeeConstr [id=" + id + ", name=" + name + ", address=" + address + ", company=" + company + "]";
	}

//	public void display() {
//		System.out.println(id + " " + name);
//		System.out.println(address.toString());
//		System.out.println(company.toString());
//	}
	

}
