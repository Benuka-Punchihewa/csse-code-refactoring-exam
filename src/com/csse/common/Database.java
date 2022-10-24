package com.csse.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Singleton Design Pattern
 * @author benuka
 *
 */
public class Database extends Property {
	private static Connection connection;

	/**
	 * Creates a database connection
	 */
	private Database() {
		try {
			Class.forName(CommonConstants.JDBC_DRIVER);
			connection = DriverManager.getConnection(properties.getProperty(CommonConstants.DB_URL_PROPERTY_KEY),
					properties.getProperty(CommonConstants.DB_USERNAME_PROPERTY_KEY),
					properties.getProperty(CommonConstants.DB_PASSWORD_PROPERTY_KEY));
		} catch (SQLException e) {
			Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
		} catch (Exception e) {
			Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
		}
	}

	/**
	 * Creates a database connection is does not exist.
	 * If exits, returns the existing instance.
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		if (connection == null) {
			new Database();
		}

		return connection;
	}

}
