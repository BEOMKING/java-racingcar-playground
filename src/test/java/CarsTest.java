import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {

    @Test
    public void 우승자를_찾을_수_있다() {
        Cars cars = new Cars(Arrays.asList(new Car("one", 2), new Car("two", 3), new Car("three", 1)));
        assertEquals(new Car("two", 3), cars.winners());
    }

    @Test
    public void 우승자는_여러명일_수_있다() {
        Cars cars = new Cars(Arrays.asList(new Car("one", 2), new Car("two", 3), new Car("three", 3)));
        assertThat(cars.winners()).containsExactly(new Car("two", 3), new Car("three", 3));
    }

}
