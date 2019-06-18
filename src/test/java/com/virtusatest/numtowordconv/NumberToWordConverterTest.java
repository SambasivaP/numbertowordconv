package com.virtusatest.numtowordconv;

import junit.framework.TestCase;

public class NumberToWordConverterTest extends TestCase {
	private NumberToWordConverter converter = null;

	public void setUp() {
		converter = new NumberToWordConverter();
	}

	public void testNumberToWordConversion() {
		String convWord = converter.NumberToWordConversion("56945781");
		//System.out.println(convWord);
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", convWord);
	}
	
	public void testNumberToWordConversionMinus() {
		String convWord = converter.NumberToWordConversion("-56945781");
		//System.out.println(convWord);
		assertEquals("minus fifty six million nine hundred and forty five thousand seven hundred and eighty one", convWord);
	}

	public void testNumberToWordConversionOnes() {
		String convWord = converter.NumberToWordConversion("6");
		//System.out.println(convWord);
		assertEquals("six", convWord);
	}

	public void testNumberToWordConversiontens() {
		String convWord = converter.NumberToWordConversion("35");
		//System.out.println(convWord);
		assertEquals("thirty five", convWord);
	}

	public void testNumberToWordConversionHundreds() {
		String convWord = converter.NumberToWordConversion("495");
		//System.out.println(convWord);
		assertEquals("four hundred and ninety five", convWord);
	}

	public void testNumberToWordConversionThousands() {
		String convWord = converter.NumberToWordConversion("9805");
		//System.out.println(convWord);
		assertEquals("nine thousand eight hundred and five", convWord);
	}

	public void testNumberToWordConversionException() {
		String convWord = converter.NumberToWordConversion("56A945781");
		//System.out.println(convWord);
		assertEquals("Enter numberic values only.", convWord);
	}

	public void tearDown() {
		converter = null;
	}
}
