package com.csse.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Property {
	public static final Properties properties = new Properties();
	static InputStream input = null;

	/**
	 * reads the property file and loads properties into the properties object.
	 */
	static {
		try {
			input = new FileInputStream(CommonConstants.PROPERTIES_FILE_PATH);
			properties.load(input);
		} catch (FileNotFoundException e) {
			Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
		} catch (Exception e) {
			Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
		} finally {
			try {
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
			} catch (Exception e) {
				Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
			}
		}
	}
}