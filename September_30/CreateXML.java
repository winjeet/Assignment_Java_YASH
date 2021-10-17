package com.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {
	
	public static void main(String[] args) throws ParserConfigurationException, TransformerException
	{
	
	File xmlFile = new File("D://FileIO//Question.xml");
	
	DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
	Document document=documentBuilder.newDocument();
	
	Element subject = document.createElement("Subject");
	subject.setAttribute("SubjectName", "Java");
	document.appendChild(subject);
	
	Element quiz = document.createElement("Quiz");
	quiz.setAttribute("Quiz Name", "Java 1");
	document.appendChild(quiz);
	
	Attr question1 =  document.createAttribute("Question 1");
	question1.setValue("Is Java used for creating Enterprise application\n a.Yes b.No");
	quiz.setAttributeNode(question1);
	
	Attr question2 =  document.createAttribute("Question 2");
	question1.setValue("Does Java support Multiple Inheritence?\n a.Yes b.No");
	quiz.setAttributeNode(question2);
	
	Attr question3 =  document.createAttribute("Question 3");
	question1.setValue("Is Java platform independant?\n a.Yes b.No");
	quiz.setAttributeNode(question3);
	
	Attr question4 =  document.createAttribute("Question 4");
	question1.setValue("Is Java an Object Oriented Programming?\n a.Yes b.No");
	quiz.setAttributeNode(question4);
	
	Element Java1Answer = document.createElement("Java 1 Answers");
	Java1Answer.setAttribute("Q No.", "Answer");
	document.appendChild(Java1Answer);
	
	Attr Answer1= document.createAttribute("Answer 1");
	Answer1.setValue("a");
	Java1Answer.setAttributeNode(Answer1);
	
	Attr Answer2= document.createAttribute("Answer 2");
	Answer2.setValue("b");
	Java1Answer.setAttributeNode(Answer2);
	
	Attr Answer3= document.createAttribute("Answer 3");
	Answer3.setValue("a");
	Java1Answer.setAttributeNode(Answer3);
	
	Attr Answer4= document.createAttribute("Answer 4");
	Answer4.setValue("a");
	Java1Answer.setAttributeNode(Answer4);
	
	TransformerFactory transformerFactory = TransformerFactory.newInstance();
	Transformer transformer = transformerFactory.newTransformer();
	
	DOMSource domSource = new DOMSource(document);
	StreamResult streamResult = new StreamResult(xmlFile);	
	transformer.transform(domSource, streamResult);	
	}
}