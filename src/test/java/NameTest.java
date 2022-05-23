import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameTest {

    @Test
    public void 이름은_5자를_초과할_수_없다() {
        assertThrows(RuntimeException.class, () -> new Name("leonard"));
    }

}
