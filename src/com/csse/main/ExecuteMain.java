package com.csse.main;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.csse.common.XmlUtil;
import com.csse.service.*;

public class ExecuteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeeServiceTemplate employeeService = new EmployeeService();
		try {
			XmlUtil.requestTransform();
			employeeService.createAndDisplayEmployees();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
