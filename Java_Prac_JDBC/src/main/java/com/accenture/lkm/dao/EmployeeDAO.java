package com.accenture.lkm.dao;

import java.sql.SQLException;

import com.accenture.lkm.beans.EmployeeBean;

public interface EmployeeDAO {
 public void readEmployee() throws SQLException, ClassNotFoundException;
 public int insertEmployee(EmployeeBean bean);
 public void updateEmployee(EmployeeBean bean);
 public void deleteEmployee(EmployeeBean bean);
}
