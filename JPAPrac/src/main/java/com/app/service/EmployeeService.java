package com.app.service;

import java.util.List;

import com.app.beans.EmployeeBean;

public interface EmployeeService {
	
public void insertEmployeeDetails(EmployeeBean employeeBean);
public EmployeeBean findEmployeeById(int id);
public void removeEmployee(int id);
public void updateEmployee(EmployeeBean empB);
public List<EmployeeBean> customQuery1();
public List<EmployeeBean> customQuery2();
public List<EmployeeBean> customQuery3();
public List<EmployeeBean> customQuery4();
}
