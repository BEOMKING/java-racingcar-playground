package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차는 이름을 가질 수 있다.")
    void run() {
        Car car = new Car();
        car.setName("BJP");
        assertEquals("BJP", car.getName());
    }

    @Test
    @DisplayName("자동차의 이름은 5자를 넘을 수 없다.")
    void validName() {
        Car car = new Car();
        assertThrows(RuntimeException.class, () -> car.setName("카와이레너드"), "자동차의 이름은 5자리를 초과할 수 없습니다.");
    }
}
