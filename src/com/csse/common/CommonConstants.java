package com.csse.common;

public class CommonConstants {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL_PROPERTY_KEY = "url";
	public static final String DB_USERNAME_PROPERTY_KEY = "username";
	public static final String DB_PASSWORD_PROPERTY_KEY="password";
	public static final String QUERY_XML_FILE_PATH_PROPERTY_KEY="queryXMLFilePath";
	public static final String QUERY_TAGNAME="query";
	public static final String QUERY_ID="id";


	public static final String EMPLOYEE_ID="Employee ID";
	public static final String EMPLOYEE_FULLNAME="Full Name";
	public static final String EMPLOYEE_ADDRESS="Address";
	public static final String EMPLOYEE_FACULTY_NAME="Faculty Name";
	public static final String EMPLOYEE_DEPARTMENT="Department";
	public static final String EMPLOYEE_DESIGNATION="Designation";

	public static final String PROPERTIES_FILE_PATH="src/com/csse/config/config.properties";

	public static final String REQUESTXML_FILE_PATH="requestXMLFilePath";
	public static final String MODIFIEDXML_FILE_PATH="modifiedXSLFilePath";
	public static final String RESPONSEXML_FILE_PATH="responseXMLFilePath";
	public static final String EMPLOYEE_XML_FILE_PATH="employeeXPath";

	public static final String EMPLOYEE_ID_PROPERTY_KEY="XpathEmployeeIDKey";
	public static final String EMPLOYEE_FULLNAME_PROPERTY_KEY="XpathEmployeeNameKey";
	public static final String EMPLOYEE_ADDRESS_PROPERTY_KEY="XpathEmployeeAddressKey";
	public static final String EMPLOYEE_FACULTYNAME_PROPERTY_KEY="XpathFacultyNameKey";
	public static final String EMPLOYEE_DEPARTMENT_PROPERTY_KEY="XpathDepartmentKey";
	public static final String EMPLOYEE_DESIGNATION_PROPERTY_KEY="XpathDesignationKey";

	public static final String EMPLOYEE_ID_FILE_PATH="employeeIDXPath";
	public static final String EMPLOYEE_FULLNAME_FILE_PATH="employeeFullNameXPath";
	public static final String EMPLOYEE_ADDRESS_FILE_PATH="employeeAddressXPath";
	public static final String EMPLOYEE_FACULTYNAME_FILE_PATH="employeeFacultyNameXPath";
	public static final String EMPLOYEE_DEPARTMENT_FILE_PATH="employeeDepartmentXPath";
	public static final String EMPLOYEE_DESIGNATION_FILE_PATH="employeeDesignationXPath";

	public static final String QUERY_CREATE_TABLE="create_table";
	public static final String QUERY_DROP_TABLE="drop_table";
	public static final String QUERY_INSERT_EMPLOYEE="insert_employee";
	public static final String QUERY_SELECT_EMPLOYEEBYID="select_EmployeeByID";
	public static final String QUERY_SELECT_ALLEMPLOYEE="select_allEmployee";
	public static final String QUERY_DELETE_EMPLOYEEBYID="delete_employeeByID";
	
}
