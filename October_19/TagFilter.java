package com.test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.junit5.Compute;
import com.junit5.FetchList;

public class TagFilter {
	private List<Integer> list;

	@BeforeEach
	void setUp() throws Exception {
		list = new FetchList().getIntegerList();
	}

	@AfterEach
	void tearDown() throws Exception {
		list = null;
	}

	@DisplayName("Test 1 : Elements present in a list or not")
	@Tag("FAST")
	@Test
	void test1() {
		assertThat(list, IsCollectionContaining.hasItems(16, 28, 10));
	}

	@DisplayName("Test 2 : Number is greater than 10")
	@Tag("SLOW")
	@Test
	void test2() {
		Compute compute = new Compute();
		assertTrue(compute.computeDivision(100, 10) >= 10);

	}
}
