package com.yash.tdddemo.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	

	@Test
	public void test_calculate_GivenEmptyString_ShouldReturnZeroAsNumber() {
		StringCalculator stringCalculator=new StringCalculator();
		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}

}
