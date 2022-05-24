import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class InputView {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public List<Car> inputCarName() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return RacingGame.makeCars(br.readLine());
    }

    public int inputCount() throws IOException {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(br.readLine());
    }

}
