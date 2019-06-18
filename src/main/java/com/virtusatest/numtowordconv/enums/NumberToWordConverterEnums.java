package com.virtusatest.numtowordconv.enums;

import java.util.HashMap;
import java.util.Map;

public enum NumberToWordConverterEnums {
	zero(0), one(1), two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), eleven(
			11), twelve(12), thirteen(13), fourteen(14), fifteen(15), sixteen(16), seventeen(17), eighteen(
					18), nineteen(19), twenty(
							20), thirty(30), forty(40), fifty(50), sixty(60), seventy(70), eighty(80), ninety(90);

	private int value;
	private static Map<Integer, NumberToWordConverterEnums> map = new HashMap<Integer, NumberToWordConverterEnums>();

	private NumberToWordConverterEnums(int value) {
		this.value = value;
	}

	static {
		for (NumberToWordConverterEnums enums : NumberToWordConverterEnums.values()) {
			map.put(enums.value, enums);
		}
	}

	public static NumberToWordConverterEnums valueOf(int pageType) {
		return (NumberToWordConverterEnums) map.get(pageType);
	}

	public int getValue() {
		return value;
	}
}
