package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReplaceWord {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter File path : ");
		String filePath = scanner.next();
		
		File file = new File(filePath);
		
		Scanner scanFile = new Scanner(file);
		StringBuffer buffer = new StringBuffer();
		
		while(scanFile.hasNextLine()) {
			buffer.append(scanFile.nextLine()+System.lineSeparator());
		}
		String fileData = buffer.toString();
		scanFile.close();
		
		System.out.print("Enter the existing word for replacement : ");
		String oldWord= scanner.next();	
		System.out.print("Enter the new word for replacement : ");
		String newWord= scanner.next();	
		
		fileData = fileData.replaceAll(oldWord, newWord);
		FileWriter writer = new FileWriter(file);
		writer.append(fileData);
		writer.flush();     
	}
}	
