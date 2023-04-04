package com.app.service;

import java.util.List;

import com.app.beans.AssetBean;
import com.app.beans.EmployeeBean;
import com.app.dao.EmployeeDao;
import com.app.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
public void insertEmployeeDetails(EmployeeBean employeeBean,AssetBean assetBean) {
	EmployeeDao emp = new EmployeeDaoImpl();
	emp.insertEmployeeDetails(employeeBean,assetBean);
}
/*public EmployeeBean findEmployeeById(int id) {
	EmployeeDao emp = new EmployeeDaoImpl();
	return emp.findEmployeeById(id);
}
public void removeEmployee(int id) {
	EmployeeDao emp = new EmployeeDaoImpl();
	emp.removeEmployee(1001);
}
public void updateEmployee(EmployeeBean empB) {
	EmployeeDao emp = new EmployeeDaoImpl();
	emp.updateEmployee(empB);
}
public List<EmployeeBean> customQuery1() {
	EmployeeDao emp = new EmployeeDaoImpl();
	return emp.customQuery1();
}
public List<EmployeeBean> customQuery2() {
	EmployeeDao emp = new EmployeeDaoImpl();
	return emp.customQuery2();
}
public List<EmployeeBean> customQuery3() {
	EmployeeDao emp = new EmployeeDaoImpl();
	return emp.customQuery3();
}
public List<EmployeeBean> customQuery4() {
	EmployeeDao emp = new EmployeeDaoImpl();
	return emp.customQuery4();
}*/
}
