import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    public void 입력값이_4이상이면_이동한다() {
        Position position = new Position(0);
        assertEquals(new Position(1), position.move(4));
        assertEquals(new Position(0), position.move(3));
    }
}
