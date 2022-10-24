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

	public static void requestTransform() {
		try {
			Source requestXMLSource = new StreamSource(new File(properties.getProperty(CommonConstants.REQUESTXML_FILE_PATH)));
		Source modifiedXSLSource = new StreamSource(new File(properties.getProperty(CommonConstants.MODIFIEDXML_FILE_PATH)));
		Result responseXMLSource = new StreamResult(new File(properties.getProperty(CommonConstants.RESPONSEXML_FILE_PATH)));
		TransformerFactory.newInstance().newTransformer(modifiedXSLSource).transform(requestXMLSource,
				responseXMLSource);
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Map<String, String>> getXmlPaths() {
		try {

			Document responseDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(properties.getProperty(CommonConstants.RESPONSEXML_FILE_PATH));
			XPath xPath = XPathFactory.newInstance().newXPath();
			int resultCount = Integer.parseInt((String) xPath.compile(properties.getProperty(CommonConstants.EMPLOYEE_XML_FILE_PATH))
					.evaluate(responseDocument, XPathConstants.STRING));

			for (int i = 1; i <= resultCount; i++) {
				xmlPath = new HashMap<String, String>();
				xmlPath.put(CommonConstants.EMPLOYEE_ID_PROPERTY_KEY,
						(String) xPath
								.compile(MessageFormat.format((String) properties.getProperty(CommonConstants.EMPLOYEE_ID_FILE_PATH), i))
								.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put(CommonConstants.EMPLOYEE_FULLNAME_PROPERTY_KEY,
						(String) xPath.compile(
								MessageFormat.format((String) properties.getProperty(CommonConstants.EMPLOYEE_FULLNAME_FILE_PATH), i))
								.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put(CommonConstants.EMPLOYEE_ADDRESS_PROPERTY_KEY,
						(String) xPath.compile(
								MessageFormat.format((String) properties.getProperty(CommonConstants.EMPLOYEE_ADDRESS_FILE_PATH), i))
								.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put(CommonConstants.EMPLOYEE_FACULTYNAME_PROPERTY_KEY, (String) xPath
						.compile(MessageFormat.format((String) properties.getProperty(CommonConstants.EMPLOYEE_FACULTYNAME_FILE_PATH), i))
						.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put(CommonConstants.EMPLOYEE_DEPARTMENT_PROPERTY_KEY, (String) xPath
						.compile(MessageFormat.format((String) properties.getProperty(CommonConstants.EMPLOYEE_DEPARTMENT_FILE_PATH), i))
						.evaluate(responseDocument, XPathConstants.STRING));

				xmlPath.put(CommonConstants.EMPLOYEE_DESIGNATION_PROPERTY_KEY, (String) xPath
						.compile(MessageFormat.format((String) properties.getProperty(CommonConstants.EMPLOYEE_DESIGNATION_FILE_PATH), i))
						.evaluate(responseDocument, XPathConstants.STRING));

				xmlPaths.add(xmlPath);
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return xmlPaths;
	}
}
