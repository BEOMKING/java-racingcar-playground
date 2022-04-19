package calculator;

public class Calculator {

	public Integer splitAndSum(String input) {
		if (isEmptyOrNull(input)) {
			return 0;
		}
		String[] numbers = input.split(",");
		return calSum(numbers);
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
