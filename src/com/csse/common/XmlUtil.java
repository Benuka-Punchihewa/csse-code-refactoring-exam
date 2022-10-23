package com.csse.common;

import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathFactory;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import org.w3c.dom.Document;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;

public class XmlUtil extends Property {

	private static final ArrayList<Map<String, String>> xmlPaths = new ArrayList<Map<String, String>>();

	private static Map<String, String> xmlPath = null;

	public static void requestTransform() throws Exception {

		Source requestXMLSource = new StreamSource(new File(properties.getProperty("requestXMLFilePath")));
		Source modifiedXSLSource = new StreamSource(new File(properties.getProperty("modifiedXSLFilePath")));
		Result responseXMLSource = new StreamResult(new File(properties.getProperty("responseXMLFilePath")));
		TransformerFactory.newInstance().newTransformer(modifiedXSLSource).transform(requestXMLSource,
				responseXMLSource);
	}

	public static ArrayList<Map<String, String>> getXmlPaths() {
		try {

			Document responseDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(properties.getProperty("responseXMLFilePath"));
			XPath xPath = XPathFactory.newInstance().newXPath();
			int resultCount = Integer.parseInt((String) xPath.compile(properties.getProperty("employeeXPath"))
					.evaluate(responseDocument, XPathConstants.STRING));

			for (int i = 1; i <= resultCount; i++) {
				xmlPath = new HashMap<String, String>();
				xmlPath.put("XpathEmployeeIDKey",
						(String) xPath
								.compile(MessageFormat.format((String) properties.getProperty("employeeIDXPath"), i))
								.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put("XpathEmployeeNameKey",
						(String) xPath.compile(
								MessageFormat.format((String) properties.getProperty("employeeFullNameXPath"), i))
								.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put("XpathEmployeeAddressKey",
						(String) xPath.compile(
								MessageFormat.format((String) properties.getProperty("employeeAddressXPath"), i))
								.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put("XpathFacultyNameKey", (String) xPath
						.compile(MessageFormat.format((String) properties.getProperty("employeeFacultyNameXPath"), i))
						.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put("XpathDepartmentKey", (String) xPath
						.compile(MessageFormat.format((String) properties.getProperty("employeeDepartmentXPath"), i))
						.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put("XpathDesignationKey", (String) xPath
						.compile(MessageFormat.format((String) properties.getProperty("employeeDesignationXPath"), i))
						.evaluate(responseDocument, XPathConstants.STRING));

				xmlPaths.add(xmlPath);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return xmlPaths;
	}
}
