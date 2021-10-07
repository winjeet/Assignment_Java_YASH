package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordsAndNumbers {
	public static void main(String[] args) throws IOException {
		try(Scanner scanner = new Scanner(System.in);){	
			System.out.print("Enter File path : ");
			String filePath = scanner.next();
			
			countWords(filePath);
			countNumbers(filePath);
		}
		
	}
	
	public static void countWords(String file) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		int count=0;
		String line = buffer.readLine();
		while(line!=null) {
			String[] arr = line.split(" ");
			for(String str : arr) {
				count++;
			}
			line = buffer.readLine();
		}
		buffer.close();
		System.out.println("Total Words contained in the file is "+count);
		
	}
	
	public static void countNumbers(String file) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		int count=0;
		String line = buffer.readLine();
		while(line!=null) {
			char[] ch = new char[line.length()];
			for(int i=0;i<ch.length;i++) {
				ch[i] = line.charAt(i);
				if(Character.isDigit(ch[i])) {
					count++;
				}
			}
			line = buffer.readLine();
		}
		buffer.close();
		System.out.println("Total Numbers contained in the file is "+count);
	}
}
