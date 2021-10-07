package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AlternatePositionIntoUpperCase {

	public static void main(String[] args) throws IOException {
		try(Scanner scanner = new Scanner(System.in);){	
			System.out.print("Enter File path : ");
			String filePath = scanner.next();
			alternatePositionIntoUpperCase(filePath);	
		}
		
	}
	
	public static void alternatePositionIntoUpperCase(String path) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(path));
		String string = "";
		String newString = "";
		String[] array;
		
		String line = buffer.readLine();
		while(line!=null) {
			string += line + System.lineSeparator();
			line = buffer.readLine();
		}
		array = string.split(" ");
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				newString +=  array[i].toLowerCase() + " ";
			}else {
				newString +=  array[i].toUpperCase() + " ";
			}
		}
		buffer.close();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		writer.write(newString);
		writer.flush();
		writer.close();
	}

}
