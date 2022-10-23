package com.csse.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import com.csse.model.Employee;
import com.csse.common.*;

public class EmployeeService extends EmployeeServiceTemplate {

	@Override
	public void addEmployeesToEmployeeList() {
		try {
			ArrayList<Map<String, String>> xmlPaths = XmlUtil.getXmlPaths();

			for (Map<String, String> xmlPath : xmlPaths) {
				Employee EMPLOYEE = new Employee();
				EMPLOYEE.setEmployeeID(xmlPath.get("XpathEmployeeIDKey"));
				EMPLOYEE.setFullName(xmlPath.get("XpathEmployeeNameKey"));
				EMPLOYEE.setAddress(xmlPath.get("XpathEmployeeAddressKey"));
				EMPLOYEE.setFacultyName(xmlPath.get("XpathFacultyNameKey"));
				EMPLOYEE.setDepartment(xmlPath.get("XpathDepartmentKey"));
				EMPLOYEE.setDesignation(xmlPath.get("XpathDesignationKey"));

				employeeList.add(EMPLOYEE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void createNewTable() {
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(QueryUtil.getQueryByID("q2"));
			statement.executeUpdate(QueryUtil.getQueryByID("q1"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertEmployeesToDB() {
		try {
			preparedStatement = connection.prepareStatement(QueryUtil.getQueryByID("q3"));
			connection.setAutoCommit(false);

			for (Employee employee : employeeList) {
				preparedStatement.setString(1, employee.getEmployeeID());
				preparedStatement.setString(2, employee.getFullName());
				preparedStatement.setString(3, employee.getAddress());
				preparedStatement.setString(4, employee.getFacultyName());
				preparedStatement.setString(5, employee.getDepartment());
				preparedStatement.setString(6, employee.getDesignation());
				preparedStatement.addBatch();
			}

			preparedStatement.executeBatch();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readEmployeesFromDB() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			preparedStatement = connection.prepareStatement(QueryUtil.getQueryByID("q5"));
			ResultSet results = preparedStatement.executeQuery();

			while (results.next()) {
				Employee employee = new Employee();
				employee.setEmployeeID(results.getString(1));
				employee.setFullName(results.getString(2));
				employee.setAddress(results.getString(3));
				employee.setFacultyName(results.getString(4));
				employee.setDepartment(results.getString(5));
				employee.setDesignation(results.getString(6));

				employees.add(employee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		displayUtil.displayEmployee(employees);
	}
}
