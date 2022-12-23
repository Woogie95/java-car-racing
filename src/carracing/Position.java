package carracing;

public class Position {

    private static final int ADD_POSITION = 1;
    private static final int POSITION_INITIAL_VALUE = 0;
    private static final int MIN_MOVE_POSSIBLE_VALUE = 4;

    private final int position;

    public Position() {
        this.position = POSITION_INITIAL_VALUE;
    }

    public Position(int position) {
        this.position = position;
    }

    public Position MovePosition(int randomNumber) {
        if (randomNumber >= MIN_MOVE_POSSIBLE_VALUE) {
            return new Position(this.position + ADD_POSITION);
        }
        return new Position();
    }

}
