package com.csse.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger extends Property {
	public static void log(String severity, String message) {
		try {
			FileWriter fileWriter = new FileWriter(properties.getProperty("logFilePath"), true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write(severity + " | " + message);
			bufferWriter.newLine();
			bufferWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
