package com.test;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestCase {
	@ParameterizedTest
	@ValueSource(ints ={2,4,6,8,10})
	void testArrayEvenElements(int element) 
	{
		assertTrue(element%2==0);
	}
}
