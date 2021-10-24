package com.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.junit5.ArraySorting;
import com.junit5.Compute;

public class AnnotationTest {
	@Feature1
	void testArraysorting() 
	{
		ArraySorting array = new ArraySorting();
		int []input = {3,5,7,1,2,4,8,9};
		int []actual = array.sortArray(input);
		int []expected = {1,2,3,4,5,7,8,9};
		assertArrayEquals(expected, actual);
	}
	
	@Feature2
	void testCalculatorOperation() 
	{
		Compute compute = new Compute();
		int no1=100;
		int no2=10;
		int expected = 10;
		int actual = compute.computeDivision(no1,no2);
		assertEquals(expected, actual);
	}
}
