package com.virtusatest.numtowordconv.service;

import com.virtusatest.numtowordconv.enums.NumberToWordConverterEnums;
import com.virtusatest.numtowordconv.exception.CustomException;
import com.virtusatest.numtowordconv.util.NumberToWordConverterUtil;

public class NumberToWordConverterService {
	public static String convertPositiveNumberToWord(int number) throws CustomException {
		return numberToWord(number);
	}

	public static String convertNegativeNumberToWord(int number) throws CustomException {
		try {
			String numberStr = "" + number;
			numberStr = numberStr.substring(1);
			return "minus " + numberToWord(Integer.parseInt(numberStr));
		} catch (CustomException e) {
			throw new CustomException(e.getMessage());
		} catch (Exception e) {
			throw new CustomException("Error while converting the number to word :" + e.getMessage());
		}

	}

	private static String numberToWord(int number) throws CustomException {
		String words = "";
		try {
			if (number == 0) {
				words = "zero";
			} else {
				if (number >= 1000000) {
					words += numberToWord(NumberToWordConverterUtil.getNumberDivisibleValue(number, 1000000))
							+ " million ";
					number = NumberToWordConverterUtil.getNumberModularValue(number, 1000000);
				}
				if (number >= 1000) {
					words += numberToWord(NumberToWordConverterUtil.getNumberDivisibleValue(number, 1000))
							+ " thousand ";
					number = NumberToWordConverterUtil.getNumberModularValue(number, 1000);
				}
				if (number >= 100) {
					words += numberToWord(NumberToWordConverterUtil.getNumberDivisibleValue(number, 100)) + " hundred ";
					number = NumberToWordConverterUtil.getNumberModularValue(number, 100);
					if (number != 0)
						words += "and ";
				}
				if (number > 0) {
					if (number < 20) {
						words += NumberToWordConverterEnums.valueOf(number);
					} else {
						words += NumberToWordConverterEnums
								.valueOf(number - NumberToWordConverterUtil.getNumberModularValue(number, 10));
						if (NumberToWordConverterUtil.getNumberModularValue(number, 10) > 0) {
							words += " " + NumberToWordConverterEnums
									.valueOf(NumberToWordConverterUtil.getNumberModularValue(number, 10));
						}
					}
				}
			}

		} catch (Exception e) {
			throw new CustomException("Error while converting the number to word :" + e.getMessage());
		}
		return words;
	}
}
