package com.virtusatest.numtowordconv.rules;

import com.virtusatest.numtowordconv.exception.CustomException;
import com.virtusatest.numtowordconv.service.NumberToWordConverterService;

public class NumberToWordConverterRules {
	public static String convertNumberToWord(int number) throws CustomException {
		String word = "";
		if (number > 0) {
			word = NumberToWordConverterService.convertPositiveNumberToWord(number);
		} else {
			word = NumberToWordConverterService.convertNegativeNumberToWord(number);
		}
		return word;
	}
}
