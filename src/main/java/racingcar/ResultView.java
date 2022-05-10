package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ResultView {

    public static void main(String[] args) throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] splited = input.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : splited) {
            cars.add(new Car(name));
        }
        Race race = new Race(cars);
        System.out.println("시도할 회수는 몇회인가요?");
        int count = Integer.parseInt(br.readLine());
        System.out.println("실행 결과");
        for (int i = 0; i < count; i++) {
            race.move();
            for (Car car : race.getCars()) {
                System.out.print(car.getName() + " : ");
                for (int j = 0; j < car.getPosition(); j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }
        int max = 0;
        for (Car car : race.getCars()) {
            max = Math.max(max, car.getPosition());
        }

        List<String> winner = new ArrayList<>();
        for (Car car : race.getCars()) {
            if (max == car.getPosition()) {
                winner.add(car.getName());
            }
        }
        for (int i = 0; i < winner.size(); i++) {
            System.out.print(winner.get(i));
            if (i != winner.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("가 최종 우승했습니다.");
    }

}
