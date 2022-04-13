package calculator;

import java.util.List;

public class Calculator {

	public static Integer add(List<Integer> numbers) {
		int num = 0;
		for (int i = 0; i < numbers.size(); i++) {
			num += numbers.get(i);
		}
		return num;
	}

}
