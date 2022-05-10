package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RaceTest {

    Race race;

    @BeforeEach
    void setUp() {
        race = new Race();
    }

    @Test
    @DisplayName("생성한 랜덤값이 범위에 부합하는지 확인")
    void checkRandom() {
        int rand = race.makeRandom();
        assertTrue(rand >= 0 && rand < 10);
        assertTrue(rand >= 0 && rand < 10);
        assertTrue(rand >= 0 && rand < 10);
        assertTrue(rand >= 0 && rand < 10);
    }

    @Test
    @DisplayName("경주에 참여한 자동차를 1회 이동시킨다.")
    void moveCarInRace() {
        race.move();
    }
}
