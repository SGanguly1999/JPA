package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="getRangeData" ,query="select k from EmployeeEntity k where k.empId >=?1 and k.empId <=?2")
@NamedQueries(
		{
			@NamedQuery(name="getNamesWithA" ,query="select k from EmployeeEntity k where k.name like 'A%'"),
			@NamedQuery(name="getNamesWithP" ,query="select k from EmployeeEntity k where k.name like 'P%'")
		}
		
		
		)
@Table(name="employee")
public class EmployeeEntity {
	
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", name=" + name + ", designation=" + designation + "]";
	}
	@Id
	@Column(name="id")
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
