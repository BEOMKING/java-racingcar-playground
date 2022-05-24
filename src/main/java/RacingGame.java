import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RacingGame {
    private final Cars cars;
    private int tryNo;

    public RacingGame(String input, int tryNo) {
        this.cars = new Cars(makeCars(input));
        this.tryNo = tryNo;
    }

    public RacingGame(Cars cars, int tryNo) {
        this.cars = cars;
        this.tryNo = tryNo;
    }

    public static List<Car> makeCars(String input) {
        List<Car> car = new ArrayList<>();
        String[] splited = input.split(",");
        for (String split: splited) {
            car.add(new Car(split));
        }
        return car;
    }

    public void race() {
        cars.move();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingGame that = (RacingGame) o;
        return tryNo == that.tryNo && Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars, tryNo);
    }
}
