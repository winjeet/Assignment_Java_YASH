package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUpperCase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Five Names:");
		for(int i=0;i<5;i++) {
			String name = scanner.nextLine();
			list.add(name);
		}
		
		System.out.println("----------------------------------");
		
		for(int i=0;i<list.size();i++) {
			String getName = list.get(i);
			
			if(getName.length()<3) {
				System.out.println("Length of Name is less than 3 : "+ getName );
			}
			else {
				getName = getName.substring(0, 2)+ getName.substring(2,3).toUpperCase()+
						getName.substring(3, getName.length()); 
				
				System.out.println("Name with 3rd letter in Upper case : "+ getName );
			}
		}
	}

}
