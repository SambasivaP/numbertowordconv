package com.virtusatest.numtowordconv;

import java.util.Scanner;

import com.virtusatest.numtowordconv.exception.CustomException;
import com.virtusatest.numtowordconv.rules.NumberToWordConverterRules;
import com.virtusatest.numtowordconv.util.NumberToWordConverterUtil;
import com.virtusatest.numtowordconv.validation.NumberToWordConverterValidation;

public class NumberToWordConverter {

	public String NumberToWordConversion(String input) {
		int number = 0;
		String words = "";
		try {
			if (NumberToWordConverterValidation.checkStringHasNumbersOnly(input)) {
				number = NumberToWordConverterUtil.convertStringToInteger(input);
				words = NumberToWordConverterRules.convertNumberToWord(number);
			} else {
				words = "Enter numberic values only.";
			}
		} catch (CustomException e) {
			words = e.getMessage();
		}
		return words;
	}

	public static void main(String[] args) {
		int number = 0;
		String input = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		while (scanner.hasNextLine()) {
			try {
				input = scanner.nextLine();
				if (NumberToWordConverterValidation.checkStringHasNumbersOnly(input)) {
					number = NumberToWordConverterUtil.convertStringToInteger(input);
					System.out.println("Number in words: " + NumberToWordConverterRules.convertNumberToWord(number));
				} else {
					System.out.println("Enter numberic values only.");
				}
			} catch (CustomException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Error while converting the number to word" + e.getMessage());
			}
		}

		scanner.close();
	}

}