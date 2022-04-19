package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public Integer splitAndSum(String input) {
		if (isEmptyOrNull(input)) {
			return 0;
		}
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
		if (m.find()) {
		    String customDelimiter = m.group(1);
		    String[] tokens= m.group(2).split(customDelimiter);
		    return calSum(tokens);
		}
		return calSum(input.split(",|:"));
	}

	private int calSum(String[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += stringToInt(numbers[i]);
		}
		return sum;
	}

	private boolean isEmptyOrNull(String input) {
		return input == null || input.isEmpty();
	}

	public Integer stringToInt(String input) {
		return Integer.parseInt(input);
	}



}
