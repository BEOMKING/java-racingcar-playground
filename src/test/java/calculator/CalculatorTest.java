package calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Validation valid;
	
	@BeforeEach
	void setUp() {
		valid = new Validation();
	}

	@Test
	void 값_더하기() {
		assertThat(Calculator.add(Arrays.asList(3, 2, 1))).isEqualTo(6);
		assertThat(Calculator.add(Arrays.asList(3, 1333, 1))).isEqualTo(1337);
	}

	@Test
	void 빈_입력값_처리() {
		assertThat(valid.isValid(null)).isEqualTo(0);
		assertThat(valid.isValid("")).isEqualTo(0);
	}
	
	@Test
	void 문자_숫자로_변환() {
		assertThat(valid.isValid(null)).isEqualTo(0);
		assertThat(valid.isValid("")).isEqualTo(0);
		assertThat(valid.isValid("3")).isEqualTo(3);
	}
	
	@Test
	void 문자를_컴마로_구분() {
		assertThat(valid.split("3,2,1")[0]).isEqualTo("3");
		assertThat(valid.split("3,2,1")[1]).isEqualTo("2");
		assertThat(valid.split("3,2,1")[2]).isEqualTo("1");
	}
	
	@Test
	void 분리한_문자를_숫자_리스트로_변환() {
		assertThat(valid.stringToList(valid.split("3,2,1")).get(0)).isEqualTo(3);
		assertThat(valid.stringToList(valid.split("3,2,1")).get(1)).isEqualTo(2);
		assertThat(valid.stringToList(valid.split("3,2,1")).get(2)).isEqualTo(1);
	}
	
}
