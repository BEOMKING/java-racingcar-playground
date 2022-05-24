import java.util.ArrayList;
import java.util.List;

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
}
