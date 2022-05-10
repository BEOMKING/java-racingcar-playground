package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    @DisplayName("자동차는 이름을 가질 수 있다.")
    void carHaveName() {
        car.setName("BJP");
        assertEquals("BJP", car.getName());
    }

    @Test
    @DisplayName("자동차의 이름은 5자를 넘을 수 없다.")
    void validName() {
        assertThrows(RuntimeException.class, () -> car.setName("카와이레너드"),
            "자동차의 이름은 5자리를 초과할 수 없습니다.");
    }

    @Test
    @DisplayName("자동차는 이동할 수 있다.")
    void carCanMove() {
        car.move(4);
        assertEquals(1, car.getPosition());
        car.move(5);
        assertEquals(2, car.getPosition());
    }

    @Test
    @DisplayName("자동차는 " + Car.CONDITION + "이상을 입력받아야 이동할 수 있다.")
    void carCanMoveInputBiggerThanInput() {
        car.move(4);
        assertEquals(1, car.getPosition());
        car.move(3);
        assertEquals(1, car.getPosition());
    }
}
