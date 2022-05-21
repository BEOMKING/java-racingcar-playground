import java.util.List;

public class ResultView {

    public void raceResult(RacingGame racingGame) {
        Cars cars = racingGame.getCars();
        List<Car> carList = cars.getCars();
        for (Car car : carList) {
            System.out.print(car.getName() + " : ");
            makeBar(car);
            System.out.println();
        }
    }

    private void makeBar(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
    }

    public void finalResult(RacingGame racingGame) {
        List<Car> winners = racingGame.winners();
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i).getName());
            if (i != winners.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
