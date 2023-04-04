package com.app.ui;

import java.util.List;

import com.app.beans.AssetBean;
import com.app.beans.EmployeeBean;
import com.app.service.EmployeeService;
import com.app.service.EmployeeServiceImpl;

public class UITester {

	public static void main(String args[]) {
		EmployeeBean empB = new EmployeeBean();
		empB.setEmpId(1001);
		empB.setName("Soumyadeep Ganguly");
		empB.setDesignation("Analyst");
		AssetBean assetB = new AssetBean();
		assetB.setAssetId(1003);
		assetB.setAssetName("Dell Inspiron");
		assetB.setType("Laptop");
		EmployeeService serve = new EmployeeServiceImpl();
	    serve.insertEmployeeDetails(empB,assetB);
		
	}
}
