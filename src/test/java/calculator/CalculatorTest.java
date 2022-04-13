package calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void 값_더하기() {
		assertThat(Calculator.add(Arrays.asList(3, 2, 1))).isEqualTo(6);
		assertThat(Calculator.add(Arrays.asList(3, 1333, 1))).isEqualTo(1337);
	}

}
