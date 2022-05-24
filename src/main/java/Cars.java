import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> winners() {
        List<Car> winners = new ArrayList<>();
        Position maxPosition = maxPosition();
        for (Car car : cars) {
            if (car.isSame(maxPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    private Position maxPosition() {
        Position max = new Position(0);
        for (Car car : cars) {
            max = car.compareAndreturnBig(max);
        }
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    public void move() {
        for (Car car : cars) {
            car.move(random());
        }
    }

    public int random() {
        Random random = new Random();
        return random.nextInt(10);
    }

}
