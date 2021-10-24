package com.java8;

import java.util.Arrays;

public class FindMaximumElementImpl {

	public static void main(String[] args) {
		int[] array = { 30, 44, 10, 3, 76, 55, 98, 19, 24, 5, 85 };
		
		FindMaximumElement findMaximumElement = (n) -> {
			Arrays.sort(n);
			return array[(n.length) - 1];
		};
		
		int maxValue = findMaximumElement.max(array);
		System.out.println(maxValue);
	}
}
