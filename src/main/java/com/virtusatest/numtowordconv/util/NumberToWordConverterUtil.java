package com.virtusatest.numtowordconv.util;

import com.virtusatest.numtowordconv.exception.CustomException;

public class NumberToWordConverterUtil {
	public static int convertStringToInteger(String input) throws CustomException {
		int output;
		try {
			output = Integer.parseInt(input);
		} catch (Exception e) {
			throw new CustomException("Enter numberic values only.");
		}
		return output;
	}

	public static int getNumberDivisibleValue(int input, int dividedBy) {
		return input / dividedBy;
	}

	public static int getNumberModularValue(int input, int dividedBy) {
		return input % dividedBy;
	}
}
