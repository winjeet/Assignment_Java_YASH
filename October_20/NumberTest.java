package com.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;

import com.mokito.MobileCheck;
import com.mokito.NumberCheck;

public class NumberTest {
	@Mock
	private MobileCheck mobileCheck;

	@InjectMocks
	private NumberCheck numberCheck;

	Answer<Boolean> answer = (invocation) -> {
		Object[] args = invocation.getArguments();
		String contact = (String) args[0];
		Pattern compile = Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher = compile.matcher(contact);
		if (matcher.find()) {
			return true;
		}
		return false;
	};

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testMobileNumber10Digit() {
		String number = "9730981155";
		when(mobileCheck.checkMobileNumber(number)).then(answer);
		boolean actual = numberCheck.check(number);
		assertTrue(actual);

	}

}
