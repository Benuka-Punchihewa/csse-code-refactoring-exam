package com.csse.common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Property {
	public static final Properties properties = new Properties();

	static {
		try {
			InputStream input = new FileInputStream(
					"src/com/csse/config/config.properties");
			properties.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}