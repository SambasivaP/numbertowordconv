package com.virtusatest.numtowordconv.util;

import com.virtusatest.numtowordconv.exception.CustomException;

import junit.framework.TestCase;

public class NumberToWordConverterUtilTest extends TestCase {
	public void testConvertStringToInteger() throws CustomException {
		assertEquals(123,NumberToWordConverterUtil.convertStringToInteger("123"));
	}

	public void testNumberDivisibleValueByHundred() {
		assertEquals(2,NumberToWordConverterUtil.getNumberDivisibleValue(230, 100));
	}

	public void testNumberDivisibleValueByThousand() {
		assertEquals(3,NumberToWordConverterUtil.getNumberDivisibleValue(3320, 1000));
	}
	
	public void testNumberModularValueByTen() {
		assertEquals(3,NumberToWordConverterUtil.getNumberModularValue(23, 10));
	}
	
	public void testNumberModularValueByHundred() {
		assertEquals(33,NumberToWordConverterUtil.getNumberModularValue(233, 100));
	}
}
