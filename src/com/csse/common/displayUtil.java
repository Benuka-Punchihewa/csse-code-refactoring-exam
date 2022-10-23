package com.csse.common;

import java.util.ArrayList;

import com.csse.model.Employee;

public class displayUtil {
	public static void displayEmployee(ArrayList<Employee> employees) {
		System.out.println(CommonConstants.EMPLOYEE_ID + "\t\t" + CommonConstants.EMPLOYEE_FULLNAME + "\t\t" + CommonConstants.EMPLOYEE_ADDRESS + "\t\t" + CommonConstants.EMPLOYEE_FACULTY_NAME + "\t\t"
				+ CommonConstants.EMPLOYEE_DEPARTMENT + "\t\t" + CommonConstants.EMPLOYEE_DESIGNATION + "\n");
		System.out
				.println("================================================================================================================");
		
		for(int i = 0; i < employees.size(); i++){
			Employee employee = employees.get(i);
			System.out.println(employee.getEmployeeID() + "\t" + employee.getFullName() + "\t\t"
					+ employee.getAddress() + "\t" + employee.getFacultyName() + "\t" + employee.getDepartment() + "\t"
					+ employee.getDesignation() + "\n");
			System.out
			.println("----------------------------------------------------------------------------------------------------------------");
		}
	}
}
