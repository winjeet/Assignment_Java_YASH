package com.multithreading;

import java.util.Arrays;

public class ArraySorting implements Runnable{
	
	int[] array1={79,23,34,78,90};
	int[] array2={55,3,20,89,23};
	int[] array3={80,43,12,34,67};
	
	@Override
	public void run() {
		try {
			Arrays.sort(array1);
			Arrays.sort(array2);
			Arrays.sort(array3);
			
			for(int i=0;i<array1.length;i++) {
				System.out.println("Sorted array1 - "+array1[i]);
				Thread.sleep(1000);
			}
			for(int i=0;i<array2.length;i++) {
				System.out.println("Sorted array2 - "+array2[i]);
				Thread.sleep(1000);
			}
			for(int i=0;i<array3.length;i++) {
				System.out.println("Sorted array3 - "+array3[i]);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		Thread thread = new Thread(new ArraySorting());
		thread.start();
	}
	
}
