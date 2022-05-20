import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class NameTest {

	@Test
	public void 이름을_생성한다() {
		Name name = new Name("BJP");
		assertEquals("BJP", name.getName());
	}
	
	@Test
	public void 이름은_5자를_초과할_수_없다() {
		assertThrows(RuntimeException.class, () -> new Name("BEOMKING"));
	}
}
