package com.tdd.example;

public class DuplicateStringArray {
	
	public static boolean findDuplicateString(String[] str) {
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					return true;
				}
			}
		}
		return false;
	}
}
