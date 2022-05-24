import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingGameTest {

    @Test
    public void Racing_Game은_쉼표로_구분된_이름을_가진_입력과_시도회수를_가진다() {
        RacingGame racingGame = new RacingGame("BJP,THT,LBJ", 5);
        RacingGame compare = new RacingGame(new Cars(Arrays.asList(new Car("BJP"), new Car("THT"), new Car("LBJ"))), 5);
        assertEquals(compare, racingGame);
    }
}
