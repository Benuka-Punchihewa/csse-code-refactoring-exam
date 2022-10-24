package com.csse.common;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;

public class QueryUtil extends Property {

	/**
	 * finds returns query by reading query xml by query id
	 * 
	 * @param id
	 * @return query string
	 */
	public static String getQueryByID(String id) {
		NodeList nodeList;
		Element element = null;
		try {

			nodeList = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new File(properties.getProperty(CommonConstants.QUERY_XML_FILE_PATH_PROPERTY_KEY)))
					.getElementsByTagName(CommonConstants.QUERY_TAGNAME);

			for (int x = 0; x < nodeList.getLength(); x++) {
				element = (Element) nodeList.item(x);
				if (element.getAttribute(CommonConstants.QUERY_ID).equals(id))
					break;
			}

		} catch (ParserConfigurationException e) {
			Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
		} catch (Exception e) {
			Logger.log(CommonConstants.HIGH_SEVERITY, e.getMessage());
		}
		return element.getTextContent().trim();
	}
}
