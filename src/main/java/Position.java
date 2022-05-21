public class Position {
    public static final int MOVE_CONDITION = 4;
    private int position;

    public int move(int input) {
        if (input >= MOVE_CONDITION) {
            return ++position;
        }
        return position;
    }

}
