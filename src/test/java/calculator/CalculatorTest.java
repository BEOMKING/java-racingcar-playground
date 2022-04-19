package calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void 빈_문자열_널값처리() {
		assertThat(Calculator.splitAndSum(" ")).isEqualTo(0);
		assertThat(Calculator.splitAndSum(null)).isEqualTo(0);
	}
	
	@Test
	void 숫자_하나를_문자열로_입력할_때_숫자를_반환() {
		Calculator calculator = new Calculator();
		assertThat(calculator.stringToInt("3")).isEqualTo(3);
	}
}
