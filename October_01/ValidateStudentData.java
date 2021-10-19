package com.io;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ValidateStudentData {

	public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
		String uri = XMLConstants.W3C_XML_SCHEMA_NS_URI;
		SchemaFactory factory= SchemaFactory.newInstance(uri);
		
		Schema schema = factory.newSchema(new File("D:\\FileIO\\Student.xsd"));
		Validator validator = schema.newValidator();
		File file = new File("D:\\FileIO\\Student.xml");
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse(file);
		DOMSource domSource = new DOMSource(document);
		
		validator.validate(domSource);	
	}
}