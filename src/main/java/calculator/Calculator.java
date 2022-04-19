package calculator;

public class Calculator {

	public Integer splitAndSum(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		String[] numbers = input.split(",");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += stringToInt(numbers[i]);
		}
		return sum;
	}

	public Integer stringToInt(String input) {
		return Integer.parseInt(input);
	}



}
