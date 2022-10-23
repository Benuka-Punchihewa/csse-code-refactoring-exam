package com.csse.common;

import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.TransformerException;
import java.io.File;
import org.xml.sax.SAXException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.transform.TransformerConfigurationException;

public class QueryUtil extends Property{

	public static String getQueryByID(String id) {
		NodeList nodeList;
		Element element = null;
		try {

			nodeList = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new File(properties.getProperty(CommonConstants.QUERY_XML_FILE_PATH_PROPERTY_KEY))).getElementsByTagName(CommonConstants.QUERY_TAGNAME);

			for (int x = 0; x < nodeList.getLength(); x++) {
				element = (Element) nodeList.item(x);
				if (element.getAttribute(CommonConstants.QUERY_ID).equals(id))
					break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return element.getTextContent().trim();
	}
}
