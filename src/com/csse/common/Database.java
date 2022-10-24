package com.csse.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database extends Property {
	private static Connection connection;

	private Database() {
		try {
			Class.forName(CommonConstants.JDBC_DRIVER);
			connection = DriverManager.getConnection(properties.getProperty(CommonConstants.DB_URL_PROPERTY_KEY),
					properties.getProperty(CommonConstants.DB_USERNAME_PROPERTY_KEY),
					properties.getProperty(CommonConstants.DB_PASSWORD_PROPERTY_KEY));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (connection == null) {
			new Database();
		}

		return connection;
	}

}
