package com.virtusatest.numtowordconv.enums;

import junit.framework.TestCase;

public class NumberToWordConverterEnumsTest extends TestCase {

	public void testEnumsValueForOne() {
		assertEquals(NumberToWordConverterEnums.one, NumberToWordConverterEnums.valueOf(1));
	}

	public void testEnumsValueForThirty() {
		assertEquals(NumberToWordConverterEnums.thirty, NumberToWordConverterEnums.valueOf(30));
	}
}
