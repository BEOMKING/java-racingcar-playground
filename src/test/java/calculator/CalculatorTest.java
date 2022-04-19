package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	@Test
	void 빈_문자열_널값처리() {
		assertThat(calculator.splitAndSum("")).isEqualTo(0);
		assertThat(calculator.splitAndSum(null)).isEqualTo(0);
	}
	
	@Test
	void 숫자_하나를_문자열로_입력할_때_숫자로_변환() {
		Calculator calculator = new Calculator();
		assertThat(calculator.stringToInt("3")).isEqualTo(3);
	}
	
	@Test
	void 숫자를_구분자로_입력한_경우_합을_반환() {
		assertThat(calculator.splitAndSum("1,2:3")).isEqualTo(6);
	}
	
	@Test
	void 문자_사이에_커스텀_구분자를_지정() {
		assertThat(calculator.splitAndSum("//;\n1;2;3")).isEqualTo(6);
	}
}
