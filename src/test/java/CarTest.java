import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    @DisplayName("자동차를 생성한다.")
    public void createCarTest() {
        Car car = new Car("BJP");
        assertEquals("BJP", car.getName());
    }

    @Test
    @DisplayName("자동차의 이름은 5자를 초과할 수 없다.")
    public void carNameOverTest() {
        assertThrows(RuntimeException.class,
                () -> new Car("kawai lenerd"));
    }

//    @Test
//    @DisplayName("입력 받은 수가 4이상일 때 움직인다.")
//    public void carMoveInputBiggerThan() {
//        Car car = new Car("BJP") {
//            @Override
//            protected int randNum() {
//                return 4;
//            }
//        };
//
//        Car car2 = new Car("a") {
//            @Override
//            protected int randNum() {
//                return 3;
//            }
//        };
//        assertEquals(1, car.move(car.randNum()));
//        assertEquals(1, car.move(car2.randNum()));
//    }
}
