package com.virtusatest.numtowordconv.validation;

import java.util.regex.Pattern;

public class NumberToWordConverterValidation {
	public static boolean checkStringHasNumbersOnly(String input) {
		Pattern pattern = Pattern.compile("-?[0-9]\\d*");
		return pattern.matcher(input).matches();
	}
}
