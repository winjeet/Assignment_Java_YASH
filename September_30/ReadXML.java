package com.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		File xmlFile=new File("D:\\FileIO\\Question.xml");
		
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
		Document document=documentBuilder.parse(xmlFile);
		document.getDocumentElement().normalize();
		String Subject=document.getDocumentElement().getNodeName();
		System.out.println("Root Element:"+Subject);
		
		NodeList nodeList=document.getElementsByTagName("Subject");
		for(int i=0;i<nodeList.getLength();i++) {
			Node node=nodeList.item(i);
			System.out.println("Node Name:"+node.getNodeName());
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element=(Element)node;	
	            System.out.println("Quiz:"+element.getAttribute("quiz"));
			    System.out.println("Question 1:"+element.getElementsByTagName("question1").item(0).getTextContent());
				System.out.println("Question 2:"+element.getElementsByTagName("question2").item(0).getTextContent());
				System.out.println("Question 3:"+element.getElementsByTagName("question3").item(0).getTextContent());
				System.out.println("Question 4:"+element.getElementsByTagName("question4").item(0).getTextContent());
			}	
		}
	}
}