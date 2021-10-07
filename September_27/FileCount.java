package com.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FileCount extends SimpleFileVisitor<Path> {

	static int count=0;
	public static void main(String[] args) throws IOException{
		String userPath = null;
		try(Scanner scanner = new Scanner(System.in);){
			System.out.print("Enter the path : ");
			userPath = scanner.nextLine();
		}
		Path path = Paths.get(userPath);
		
		Files.walkFileTree(path, new FileCount());
		System.out.println("Number of Files in this path is "+count);
	}
	
	public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {
		System.out.println(path.getFileName());
		if(path.getFileName() != null) {
			count++;
		}
		return FileVisitResult.CONTINUE;
		
	}
}
