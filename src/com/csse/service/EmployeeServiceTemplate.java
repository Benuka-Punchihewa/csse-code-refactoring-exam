package com.csse.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.csse.model.Employee;
import com.csse.common.*;

/**
 * Definition of template class
 * uses template method design pattern
 *
 */
public abstract class EmployeeServiceTemplate {

	protected final ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	// get a database connection
	protected final Connection connection = Database.getConnection();
	
	protected PreparedStatement preparedStatement;

	public abstract void addEmployeesToEmployeeList();

	public abstract void createNewTable();

	public abstract void insertEmployeesToDB();

	public abstract void readEmployeesFromDB();

	/**
	 * This method defines the skeleton of operations to be followed
	 */
	public final void createAndDisplayEmployees() {
		addEmployeesToEmployeeList();
		createNewTable();
		insertEmployeesToDB();
		readEmployeesFromDB();
	}
}
