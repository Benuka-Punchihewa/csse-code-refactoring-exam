package com.csse.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger extends Property {
	/**
	 * Accepts severity and message and create a log record in log fle
	 * @param severity
	 * @param message
	 */
	public static void log(String severity, String message) {
		try {
			FileWriter fileWriter = new FileWriter(properties.getProperty("logFilePath"), true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			// write error severity and message in next time
			bufferWriter.write(severity + " | " + message);
			// create a new line
			bufferWriter.newLine();
			// close buffer writer
			bufferWriter.close();
			// close file writer
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
