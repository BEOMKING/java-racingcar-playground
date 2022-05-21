import java.util.List;

public class RacingGame {
    private Cars cars;

    public RacingGame(Cars cars) {
        this.cars = cars;
    }

    public void race() {
        cars.race();
    }

    public List<Car> winners() {
        return cars.winners();
    }

    public Cars getCars() {
        return cars;
    }
}
