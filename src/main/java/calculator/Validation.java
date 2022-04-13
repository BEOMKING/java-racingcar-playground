package calculator;

import java.util.ArrayList;
import java.util.List;

public class Validation {

	public Integer isValid(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		return stringToInt(input);	
	}
		
	private Integer stringToInt(String input) {
		return Integer.parseInt(input);
	}

	public String[] split(String input) {
		return input.split(",");
	}
	
	public List<Integer> stringToList(String[] input) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			numbers.add(isValid(input[i]));
		}
		return numbers;
	}

}
