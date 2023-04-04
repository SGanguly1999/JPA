package com.accenture.lkm.ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.dao.EmployeeDAOImpl;

public class UITester {
	static Connection conn=null;
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		EmployeeDAO emp = new EmployeeDAOImpl();
		emp.readEmployee();
	}
}