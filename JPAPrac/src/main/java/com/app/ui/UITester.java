package com.app.ui;

import java.util.List;

import com.app.beans.EmployeeBean;
import com.app.service.EmployeeService;
import com.app.service.EmployeeServiceImpl;

public class UITester {

	public static void main(String args[]) {
		EmployeeBean empB = new EmployeeBean();
		empB.setEmpId(1001);
		empB.setName("Soumyadeep Ganguly");
		empB.setDesignation("Analyst");
		EmployeeService serve = new EmployeeServiceImpl();
		//serve.insertEmployeeDetails(empB);
		System.out.println(serve.findEmployeeById(1001));
		empB.setDesignation("Application");
		//serve.updateEmployee(empB);
		List<EmployeeBean> empBList = serve.customQuery4();
		for(EmployeeBean empBl: empBList) {
			System.out.println(empBl);
		}
		//serve.removeEmployee(1001);
	}
}
