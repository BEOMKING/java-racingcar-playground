import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void 이름을_가진_자동차_객체를_생성한다() {
        Car car = new Car("BJP");
        assertEquals(new Car("BJP"), car);
    }

    @Test
    public void 입력을_4이상_받으면_이동한다() {
        Car car = new Car("BJP");
        car.move(4);
        assertEquals(new Car("BJP", 1), car);
    }

}
