package com.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Scanner;

public class SearchExtensionFile extends SimpleFileVisitor<Path>{
	public static void main(String[] args) throws IOException{
		String extension = null;
		try(Scanner scanner = new Scanner(System.in);){
			System.out.print("Enter extension : ");
			extension = scanner.next();
		}
		getFileName(extension);
	}
	
	public static void getFileName(String extension) {
		
		File file=new File("D:\\Java assignment");
		File[] files=file.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
             if(pathname.getName().endsWith(extension)) {
            	 return true;
             }
				return false;
			}
		});
		for(File extensionFile:files) {
			System.out.println(extensionFile);
		}	
	}

}
