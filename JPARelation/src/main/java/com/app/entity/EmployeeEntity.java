package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
	private int empId;
	private String name;
	private String designation;
	public AssetEntity getAsset() {
		return asset;
	}
	public void setAsset(AssetEntity asset) {
		this.asset = asset;
	}
	@OneToOne
	@JoinColumn(name = "asset_fk",foreignKey = @ForeignKey(name = "asset_fk",foreignKeyDefinition = "ON DELETE SET NULL"), unique=true,nullable = true)
	private AssetEntity asset;
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
