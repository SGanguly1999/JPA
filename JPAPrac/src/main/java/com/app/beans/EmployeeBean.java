package com.app.beans;

import javax.persistence.Id;

public class EmployeeBean {
	
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", name=" + name + ", designation=" + designation + "]";
	}
	int empId;
	String name;
	String designation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
