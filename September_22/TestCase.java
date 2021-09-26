package com.tdd.test;

import static org.junit.Assert.;

import org.junit.Test;

import com.tdd.example.CountPrimeNumber;
import com.tdd.example.DuplicateStringArray;
import com.tdd.example.FourthMaxArray;

public class TestCase {


	@Test
	public void testMaxArray() {
		assertEquals(6,FourthMaxArray.findFourthMax(new int[] {2,5,3,1,6,4,7,9,8}));
	}
	
	@Test
	public void testDuplicateString() {
		assertEquals(true,DuplicateStringArray.findDuplicateString(new String[]
				{Java,is,a,Programming,language,and,Java,is,Object,
						Oriented}));
	}
	
	@Test
	public void testCountPrimeNumber() {
		assertEquals(4,CountPrimeNumber.countPrimeNumber(new int[] {2,3,4,5,6,7}));
	}

}
