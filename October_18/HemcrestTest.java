package com.test;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HemcrestTest {
	@Test
	public void testStringStartWithAndEndWith() {
		String str = "Shreshah";
		assertThat(str,startsWith("S"));
		assertThat(str, endsWith("h"));	
	}
	
	@Test
	public void testIfObjectReferenceIsNull() {
		Object obj = null;
		assertThat(obj, nullValue());
	}
	
	@Test
	public void testIfObjectReferenceIsNotNull() {
		Object obj = new Object();
		assertThat(obj, notNullValue());
	}

}
