package com.app.beans;

public class EmployeeBean {
	
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", name=" + name + ", designation=" + designation + "]";
	}
	int empId;
	String name;
	String designation;
	private AssetBean asset;
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
	public AssetBean getAsset() {
		return asset;
	}
	public void setAsset(AssetBean asset) {
		this.asset = asset;
	}

}
