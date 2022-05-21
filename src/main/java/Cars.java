import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void race() {
        for (Car car : cars) {
            car.move(random());
        }
    }

    private int random() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public List<Car> winners() {
        List<Car> winners = new ArrayList<>();
        int max = findMax();
        for (Car car : cars) {
            if (car.getPosition() == max) {
                winners.add(car);
            }
        }
        return winners;
    }

    private int findMax() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(max, car.getPosition());
        }
        return max;
    }

}
