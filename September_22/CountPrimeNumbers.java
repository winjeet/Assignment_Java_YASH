package com.tdd.example;

public class CountPrimeNumber {

	public static int countPrimeNumber(int[] arr) {
		int count=0,flag;
		for(int i=0;i<arr.length;i++) {
			int j=2;
			flag=1;
			while (j < arr[i]) {
				if(arr[i]%j==0 ) {
					flag=0;
					break;
				}
				j++;
			}
			if(flag==1) {
				count++;
			}
		}
		
		return count;
	}
}
