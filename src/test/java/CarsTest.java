import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CarsTest {

    @Test
    public void 모든차를_한턴_이동시킨다() {
        Car a = new Car("a");
        Car b = new Car("b");
        Car c = new Car("c");
        List<Car> carList = new ArrayList<>();
        a.move(4);
        b.move(4);
        c.move(3);
        carList.add(a);
        carList.add(b);
        carList.add(c);
        Cars cars = new Cars(carList);
        List<Car> winners = cars.winners();
        for (Car car : winners) {
            System.out.println(car.getName());
        }

    }
}
