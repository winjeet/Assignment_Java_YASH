package com.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLSAXParser {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		
		File xmlFile=new File("D:\\FileIO\\Employee.xml");
		InputStream is=ClassLoader.getSystemResourceAsStream("Employee.xml");
		
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
		Document document=documentBuilder.parse(is);
		document.getDocumentElement().normalize();
		String employees=document.getDocumentElement().getNodeName();
		System.out.println("Employees:"+employees);
		
		System.out.println(document.getDocumentElement().getNodeName());
		
		NodeList nodeList=document.getElementsByTagName("employee");
		for(int i=0;i<nodeList.getLength();i++) {
			
			Node node=nodeList.item(i);
			System.out.println(node.getNodeName());
			
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element=(Element)node;
				NodeList empList=element.getElementsByTagName("employee");
				
				for(int j=0;j<empList.getLength();j++) {
					Node empNode=empList.item(j);
					if(empNode.getNodeType()==Node.ELEMENT_NODE) {
						Element empElement=(Element)empNode;
						System.out.println("Employee Id:"+empElement.getAttribute("empId"));
						System.out.println("Employee Name:"+empElement.getAttribute("empName"));
						System.out.println("Employee Salary:"+empElement.getAttribute("empSalary"));
					}
				}
			}
		}
	}
}
