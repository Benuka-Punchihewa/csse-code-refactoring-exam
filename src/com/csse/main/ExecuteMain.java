package com.csse.main;

import com.csse.common.Logger;
import com.csse.common.*;
import com.csse.service.*;

public class ExecuteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create an instance of abstract class which contains the algorithm skeleton 
		EmployeeServiceTemplate employeeService = new EmployeeService();
		try {
			// transform 
			XmlUtil.requestTransform();
			
			// call template method to do relevant process to display employee details
			employeeService.createAndDisplayEmployees();
		} catch (Exception e) {
			Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
		}

	}

}
