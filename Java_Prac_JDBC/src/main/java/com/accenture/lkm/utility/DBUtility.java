package com.accenture.lkm.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtility {
	public static String userName = "root";
	public static String password = "root";
	public static String url = "jdbc:mysql://localhost:3306/aeh?useSSL= false";
	private static Connection connection = null;
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
		
		if(connection !=null)
			return connection;
		//Register the driver class
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Registered");
		connection = DriverManager.getConnection(url,userName,password);
		//System.out.println("Connection established");
		return connection;
	}
	public static void getDBDestroyConnection() throws SQLException {
		connection.close();
		connection = null;
	}
}


/* 
 * 6 steps for connecting to database with JDBC
 * 
 * 1)Importing the required packages
 * 2)Registering the driver
 * 3)Getting the connection
 * 4)Creating a statement
 * 5)Executing the statement
 * 6)Closing the connection
 */