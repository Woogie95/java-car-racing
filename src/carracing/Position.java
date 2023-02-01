package carracing;

public class Position {

    private static final int ADD_POSITION = 1;

    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public Position movable() {
        return new Position(this.position + ADD_POSITION);
    }

    public int getPosition() {
        return position;
    }

}
