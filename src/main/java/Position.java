import java.util.Objects;

public class Position {
    public static final int FORWARD_CONDITION = 4;
    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public Position move(int input) {
        if (input >= FORWARD_CONDITION) {
            return new Position(position + 1);
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
