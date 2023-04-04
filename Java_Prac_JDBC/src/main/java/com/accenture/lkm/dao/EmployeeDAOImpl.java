package com.accenture.lkm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.accenture.lkm.beans.EmployeeBean;
import com.accenture.lkm.utility.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Connection conn;
	private static Statement statement = null;
	public void readEmployee() throws SQLException, ClassNotFoundException {
	    conn = DBUtility.getDBConnection(); // getting DB connection
		String query = "select * from employee";
		statement = conn.createStatement(); // Creating statement
		ResultSet rs = statement.executeQuery(query); // Executing query
		while(rs.next()) {
			System.out.println(rs.getInt("employeeId")+"\t"+rs.getString("employeeName")+"\t"+rs.getString("role"));
			
		}
		
	}
	
	public int insertEmployee(EmployeeBean bean) {
		 return 0;
	}
	public void updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		
	}
	public void deleteEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		
	}
}

