package com.csse.common;

public class CommonConstants {
	// JDBC driver to be used for the database connection
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	// keys
	public static final String DB_URL_PROPERTY_KEY = "url";
	public static final String DB_USERNAME_PROPERTY_KEY = "username";
	public static final String DB_PASSWORD_PROPERTY_KEY="password";
	public static final String QUERY_XML_FILE_PATH_PROPERTY_KEY="queryXMLFilePath";
	public static final String QUERY_TAGNAME="query";
	public static final String QUERY_ID="id";
	
	// strings
	public static final String EMPLOYEE_ID="Employee ID";
	public static final String EMPLOYEE_FULLNAME="Full Name";
	public static final String EMPLOYEE_ADDRESS="Address";
	public static final String EMPLOYEE_FACULTY_NAME="Faculty Name";
	public static final String EMPLOYEE_DEPARTMENT="Department";
	public static final String EMPLOYEE_DESIGNATION="Designation";
	
	// properties file path
	public static final String PROPERTIES_FILE_PATH="src/com/csse/config/config.properties";
	// request employee xml file path
	public static final String REQUESTXML_FILE_PATH="requestXMLFilePath";
	// modified employee xsl file path
	public static final String MODIFIEDXML_FILE_PATH="modifiedXSLFilePath";
	// reponse employee xml file path
	public static final String RESPONSEXML_FILE_PATH="responseXMLFilePath";
	
	// Xpath keys
	public static final String EMPLOYEE_XML_FILE_PATH="employeeXPath";
	public static final String EMPLOYEE_ID_PROPERTY_KEY="XpathEmployeeIDKey";
	public static final String EMPLOYEE_FULLNAME_PROPERTY_KEY="XpathEmployeeNameKey";
	public static final String EMPLOYEE_ADDRESS_PROPERTY_KEY="XpathEmployeeAddressKey";
	public static final String EMPLOYEE_FACULTYNAME_PROPERTY_KEY="XpathFacultyNameKey";
	public static final String EMPLOYEE_DEPARTMENT_PROPERTY_KEY="XpathDepartmentKey";
	public static final String EMPLOYEE_DESIGNATION_PROPERTY_KEY="XpathDesignationKey";
	
	// property Keys to access xpaths stored in property file
	public static final String EMPLOYEE_ID_X_PATH="employeeIDXPath";
	public static final String EMPLOYEE_FULLNAME_X_PATH="employeeFullNameXPath";
	public static final String EMPLOYEE_ADDRESS_X_PATH="employeeAddressXPath";
	public static final String EMPLOYEE_FACULTYNAME_X_PATH="employeeFacultyNameXPath";
	public static final String EMPLOYEE_DEPARTMENT_X_PATH="employeeDepartmentXPath";
	public static final String EMPLOYEE_DESIGNATION_X_PATH="employeeDesignationXPath";
	
	// query id to access query to create table
	public static final String QUERY_CREATE_TABLE="create_table";
	// query id to access query to drop table
	public static final String QUERY_DROP_TABLE="drop_table";
	// query id to access query to insert employee
	public static final String QUERY_INSERT_EMPLOYEE="insert_employee";
	// query id to access query to select employee by ID
	public static final String QUERY_SELECT_EMPLOYEEBYID="select_EmployeeByID";
	// query id to access query to select all employees
	public static final String QUERY_SELECT_ALLEMPLOYEE="select_allEmployee";
	// query id to access query to delete an employee by ID
	public static final String QUERY_DELETE_EMPLOYEEBYID="delete_employeeByID";
	
	// high error severity
	public static final String HIGH_SEVERITY="HIGH SEVERITY";
	// medium error severity
	public static final String MEDIUM_SEVERITY="MEDIUM SEVERITY";
	// low error severity
	public static final String LOW_SEVERITY="LOW SEVERITY";
	
}
