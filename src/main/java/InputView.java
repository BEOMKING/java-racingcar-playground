import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String name = br.readLine();
        System.out.println("시도할 회수는 몇회인가요?");
        int count = Integer.parseInt(br.readLine());
        String[] names = name.split(",");
        RacingGame racingGame = new RacingGame(new Cars(convertCars(names)));
        System.out.println("실행 결과");
        race(count, racingGame);
        winner(racingGame);
    }

    private static void winner(RacingGame racingGame) {
        ResultView resultView = new ResultView();
        resultView.finalResult(racingGame);
    }

    private static void race(int count, RacingGame racingGame) {
        for (int i = 0; i < count; i++) {
            racingGame.race();
        }
        ResultView resultView = new ResultView();
        resultView.raceResult(racingGame);
    }

    private static List<Car> convertCars(String[] names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
