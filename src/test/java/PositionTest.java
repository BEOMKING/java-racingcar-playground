import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    public void 입력4를_받으면_1증가한다() {
        Position position = new Position();
        assertEquals(1, position.move(4));
        assertEquals(1, position.move(3));
    }


}
