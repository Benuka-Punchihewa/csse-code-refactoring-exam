package com.csse.model;

import com.csse.common.CommonConstants;

/**
 * Employee model class
 *
 */
public class Employee {

	public String employeeID;
	public String fullName;
	public String address;
	public String facultyName;
	public String department;
	public String designation;

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return CommonConstants.EMPLOYEE_ID + " = " + employeeID + "\n" + CommonConstants.EMPLOYEE_FULLNAME + " = "
				+ fullName + "\n" + CommonConstants.EMPLOYEE_ADDRESS + " = " + address + "\n"
				+ CommonConstants.EMPLOYEE_FACULTY_NAME + " = " + facultyName + "\n"
				+ CommonConstants.EMPLOYEE_DEPARTMENT + " = " + department + "\n" + CommonConstants.EMPLOYEE_DESIGNATION
				+ " = " + designation;
	}
}
