package com.assignment.calculate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorUtilTest {

	private StringCalculatorUtil stringCalculatorUtil;

	@BeforeEach
	void createInstance() {

		stringCalculatorUtil = new StringCalculatorUtil();
	}

	@Test
	void testAddNumbersWithEmptyInput() {

		Integer expected = 0;
		Integer actual = stringCalculatorUtil.addNumbers("");
		assertEquals(expected, actual, "This add method is for when input is empty string ");

	}

	@Test
	void testAddNumbersWhenTwoInput() {
		Integer expected = 9;
		Integer actual = stringCalculatorUtil.addNumbers("4,5");
		assertEquals(expected, actual, "This add method is for when input is 1 or 2 numbers");
	}
	
	@Test
	void testAddNumbersWhenUnknownAmountOfNumbersInput() {
		Integer expected = 30;
		Integer actual = stringCalculatorUtil.addNumbers("4,5,6,7,8");
		assertEquals(expected, actual, "This add method is for when input is 1 or 2 numbers");
	}

}
