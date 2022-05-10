package racingcar;

import java.util.List;
import java.util.Random;

public class Race {

    private static final int LIMIT = 10;

    private List<Car> cars;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public int makeRandom() {
        Random random = new Random();
        return random.nextInt(LIMIT);
    }

    public void move() {
        for (Car car : cars) {
            car.move(makeRandom());
        }
    }
}
